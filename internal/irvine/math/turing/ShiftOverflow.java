package irvine.math.turing;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.UnaryOperator;

/**
 * Checked tape rewrites for the related shift-overflow counters.
 * @author Gregory Morse
 */
final class ShiftOverflow {
  private static final int[] S34 = {7, 10, 9, 5, 14, 0, 18, -1, 2, 3};
  private static final int[] S35 = {7, 10, 9, 5, 14, 0, 18, -1, 2, 0};
  private static final int[] S33 = {7, 10, 9, 5, 14, 0, 18, -1, 2, 19};
  private static final int[] S26 = {7, 14, 11, 5, 2, 11, 18, 0, 10, -1};
  private static final int[] S15 = {7, -1, 11, 6, 14, 19, 6, 12, 3, 9};
  private static final String BLANK = "!";

  private final int[] mRules;

  private ShiftOverflow(final int[] rules) {
    this.mRules = rules;
  }

  static final class Position {
    private final int mQ;
    private final boolean mRight;
    private final String mL;
    private final String mR;

    Position(final int q, final boolean right, final String l, final String r) {
      this.mQ = q;
      this.mRight = right;
      this.mL = normalize(l);
      this.mR = normalize(r);
    }

    @Override
    public boolean equals(final Object other) {
      if (!(other instanceof Position)) {
        return false;
      }
      final Position p = (Position) other;
      return p.mQ == mQ && p.mRight == mRight && p.mL.equals(mL) && p.mR.equals(mR);
    }

    @Override
    public int hashCode() {
      return Objects.hash(mQ, mRight, mL, mR);
    }
  }

  private static String normalize(final String side) {
    final int end = side.length() - 1;
    if (side.charAt(end) != '!') {
      return side;
    }
    int i = end;
    while (i > 0 && side.charAt(i - 1) == '0') {
      --i;
    }
    return side.substring(0, i) + BLANK;
  }

  private Position step(final Position p) {
    final String source = p.mRight ? p.mR : p.mL;
    final char bit = source.charAt(0);
    if (bit != '0' && bit != '1' && bit != '!') {
      return null;
    }
    final int rule = mRules[2 * p.mQ + (bit == '1' ? 1 : 0)];
    if (rule < 0) {
      return null;
    }
    final String rest = bit == '!' ? BLANK : source.substring(1);
    final String l = p.mRight ? p.mL : rest;
    final String r = p.mRight ? rest : p.mR;
    final String write = (rule & 2) == 0 ? "0" : "1";
    return (rule & 1) == 0 ? new Position(rule >>> 2, false, l, write + r) : new Position(rule >>> 2, true, write + l, r);
  }

  @SafeVarargs
  private final boolean advances(final Position from, final Position to, final UnaryOperator<Position>... lemmas) {
    final Set<Position> seen = new HashSet<>();
    final ArrayDeque<Position> queue = new ArrayDeque<>();
    queue.add(from);
    while (!queue.isEmpty() && seen.size() < 512) {
      final Position p = queue.removeFirst();
      add(step(p), seen, queue);
      for (final UnaryOperator<Position> lemma : lemmas) {
        add(lemma.apply(p), seen, queue);
      }
      if (seen.contains(to)) {
        return true;
      }
    }
    return false;
  }

  private static void add(final Position p, final Set<Position> seen, final ArrayDeque<Position> queue) {
    if (p != null && seen.add(p)) {
      queue.add(p);
    }
  }

  private static Position left(final int q, final String l, final String r) {
    return new Position(q, false, l, r);
  }

  private static Position right(final int q, final String l, final String r) {
    return new Position(q, true, l, r);
  }

  private static UnaryOperator<Position> leftInc(final String from, final String to) {
    return leftInc(2, from, to);
  }

  private static UnaryOperator<Position> leftInc(final int q, final String from, final String to) {
    return p -> p.mQ == q && !p.mRight && p.mL.equals(from) ? right(1, to, p.mR) : null;
  }

  private static UnaryOperator<Position> rightInc(final String from, final String to, final boolean overflow) {
    return rightInc(2, "0", from, to, overflow);
  }

  private static UnaryOperator<Position> rightInc(final int q, final String prefix, final String from, final String to,
                                                  final boolean overflow) {
    return p -> p.mQ == q && p.mRight && p.mL.startsWith(prefix) && p.mR.equals(from)
      ? left(overflow ? 2 : 0, p.mL.substring(1), overflow ? to : "0" + to) : null;
  }

  private static String encodeRight(int m) {
    final StringBuilder s = new StringBuilder();
    while (m != 0) {
      s.append('1').append((char) ('0' + (m & 1)));
      m >>>= 1;
    }
    return s.append(BLANK).toString();
  }

  private boolean checked(final String name, final boolean result) {
    if (!result) {
      System.out.println("INCONCLUSIVE shift-overflow " + Arrays.toString(mRules) + ": " + name);
    }
    return result;
  }

  private boolean initializes(final Position from, final Position to) {
    Position p = from;
    for (int i = 0; p != null && i < 30_000; ++i, p = step(p)) {
      if (p.equals(to)) {
        return true;
      }
    }
    return false;
  }

  // A small exact tape replay with optional opaque strings at the ends.
  static boolean rawPath(final int[] rules, final Position from, final Position target) {
    final ShiftOverflow checker = new ShiftOverflow(rules);
    Position p = from;
    for (int i = 0; i < 512 && p != null; ++i) {
      p = checker.step(p);
      if (target.equals(p)) {
        return true;
      }
    }
    return false;
  }

  private boolean localRules() {
    // Binary digits nearest the head first; left digits are blocks 000b,
    // right digits are blocks 1b. U,V are opaque tails, X/Y the before/after
    // pair from a structurally smaller increment. No opaque bit is read.
    return leftRules()
      && checked("right low zero", advances(right(2, "0U", "10X"), left(0, "U", "011X")))
      && checked("right carry", advances(right(2, "0U", "11X"), left(0, "U", "010Y"), rightInc("X", "Y", false)))
      && checked("right one overflow", advances(right(2, "0U", "11!"), left(2, "U", "1011!")))
      && checked("right overflow carry", advances(right(2, "0U", "11X"), left(2, "U", "10Y"), rightInc("X", "Y", true)))
      && checked("counter increment with marker zero", advances(left(2, "U", "1010X"), left(2, "V", "1010Y"),
          leftInc("U", "V"), rightInc("X", "Y", false)))
      && checked("counter increment with marker one", advances(left(2, "U", "1011X"), left(2, "V", "1011Y"),
          leftInc("U", "V"), rightInc("X", "Y", false)))
      && checked("start reset", advances(left(2, "U", "1010X"), left(2, "V", "1011Y"),
          leftInc("U", "0V"), rightInc("X", "Y", true)))
      && checked("eat left digit", advances(left(2, "0001U", "1X"), left(2, "U", "11111X")))
      && checked("eat reset digit", advances(left(2, "0010U", "X"), left(2, "U", "1010Y"), rightInc("X", "Y", false)))
      && checked("initialization", initializes(right(0, BLANK, BLANK), left(2, BLANK, "1010" + encodeRight(1441))));
  }

  private boolean leftRules() {
    return checked("left zero", advances(left(2, BLANK, "U"), right(1, "0001!", "U")))
      && checked("left low zero", advances(left(2, "0000X", "U"), right(1, "0001X", "U")))
      && checked("left carry", advances(left(2, "0001X", "U"), right(1, "0000Y", "U"), leftInc("X", "Y")));
  }

  private boolean local33() {
    return leftRules()
      && checked("right low zero", advances(right(4, "1U", "10X"), left(0, "U", "011X")))
      && checked("right carry", advances(right(4, "1U", "11X"), left(0, "U", "010Y"), rightInc(4, "1", "X", "Y", false)))
      && checked("right one overflow", advances(right(4, "1U", "11!"), left(2, "U", "1011!")))
      && checked("right overflow carry", advances(right(4, "1U", "11X"), left(2, "U", "10Y"), rightInc(4, "1", "X", "Y", true)))
      && checked("counter increment", advances(left(2, "U", "101010X"), left(2, "V", "101010Y"),
          leftInc("U", "V"), rightInc(4, "1", "X", "Y", false)))
      && checked("reset counter increment", advances(left(2, "U", "1010X"), left(2, "V", "1010Z"),
          leftInc("U", "V"), rightInc(4, "1", "X", "Y", false), rightInc(4, "1", "Y", "Z", false)))
      && checked("start reset", advances(left(2, "U", "101010X"), left(2, "V", "101011Y"),
          leftInc("U", "0V"), rightInc(4, "1", "X", "Y", true)))
      && checked("eat left digit", advances(left(2, "0001U", "1X"), left(2, "U", "11111X")))
      && checked("eat reset digit even", advances(left(2, "0010U", "10X"), left(2, "U", "101010Y"),
          rightInc(4, "1", "10X", "11X", false), rightInc(4, "1", "11X", "10Y", false)))
      && checked("eat reset digit odd", advances(left(2, "0010U", "11X"), left(2, "U", "101011Y"),
          rightInc(4, "1", "11X", "10Y", false), rightInc(4, "1", "10Y", "11Y", false)))
      && checked("remove odd left digit, even tail", advances(left(2, "0010000U", "1010X"), left(2, "000U", "10101011X")))
      && checked("remove odd left digit, odd tail", advances(left(2, "0010001U", "1010X"), left(2, "001U", "10101011X")))
      && checked("finish reset", advances(left(2, "001!", "1010X"), left(2, BLANK, "10101011X")))
      && checked("initialization", initializes(right(0, BLANK, BLANK), left(2, "001!", "1010" + encodeRight(17))));
  }

  private static UnaryOperator<Position> right26(final String from, final String to, final boolean overflow) {
    return p -> p.mQ == 2 && p.mRight && p.mR.equals(from) && (!overflow || p.mL.startsWith("1"))
      ? left(3, overflow ? p.mL.substring(1) : p.mL, to) : null;
  }

  private boolean local26() {
    return checked("left zero", advances(left(3, BLANK, "U"), right(1, "0001!", "U")))
      && checked("left low zero", advances(left(3, "0000X", "U"), right(1, "0001X", "U")))
      && checked("left carry", advances(left(3, "0001X", "U"), right(1, "0000Y", "U"), leftInc(3, "X", "Y")))
      && checked("right low zero", advances(right(2, "U", "10X"), left(3, "U", "11X")))
      && checked("right carry", advances(right(2, "U", "11X"), left(3, "U", "10Y"), right26("X", "Y", false)))
      && checked("right one overflow", advances(right(2, "1U", "11!"), left(3, "U", "1011!")))
      && checked("right overflow carry", advances(right(2, "1U", "11X"), left(3, "U", "10Y"), right26("X", "Y", true)))
      && checked("counter increment with marker zero", advances(left(3, "U", "1010X"), left(3, "V", "1010Y"),
          leftInc(3, "U", "V"), right26("X", "Y", false)))
      && checked("counter increment with marker one", advances(left(3, "U", "1011X"), left(3, "V", "1011Y"),
          leftInc(3, "U", "V"), right26("X", "Y", false)))
      && checked("start reset zero", advances(left(3, "U", "1010X"), left(3, "V", "1011Y"),
          leftInc(3, "U", "0V"), right26("X", "Y", true)))
      && checked("start reset one, one-bit counter", advances(left(3, "U", "101111!"), left(3, "0000V", "101011!"),
          leftInc(3, "U", "000V")))
      && checked("start reset one, carry", advances(left(3, "U", "101111X"), left(3, "0000V", "1010Y"),
          leftInc(3, "U", "000V"), right26("X", "Y", true)))
      && checked("eat left digit", advances(left(3, "0001U", "1X"), left(3, "U", "11111X")))
      && checked("eat K digit", advances(left(3, "0010U", "X"), left(3, "U", "1011Y"), right26("X", "Y", false)))
      && checked("eat J digit", advances(left(3, "10U", "X"), left(3, "U", "10Y"), right26("X", "Y", false)));
  }

  /**
   * For D(0,m), let b(m)=2^bitLength(m)-1-m. Take b(m) ordinary
   * increments and the overflow, which starts E(b(m)+1,1,2^bitLength(m)).
   * Here 0&lt;n&lt;=b(m) for the new E(n,a,m). Reset E by writing
   * n=2^k(1+2n'), u=2^k-1, v=m+u. In K(n) the near k zero
   * digits (the ones in L would be in the same locations) are followed
   * by the reset digit 0010. The fixed-width carry uses u iterations,
   * all legal since u&lt;n&lt;=b(m); then eat the k ones and reset digit.
   * The rewrites give E(n',0,m') with m'=4^k(4v+2a+1). In particular
   * b(m')=4^k(4b(v)+2-2a)+(4^k-1) &gt;= b(v) &gt;= n-u &gt;= n'.
   * Because n'&lt;n, the reset terminates at E(0,0,m')=D(0,m').
   * Every cycle performs the overflow step, hence has positive length.
   * L(n)=0.K(n), including n=0 by the infinite blank tail. For k=0
   * the fixed-width carry and the sequence of eat-left rewrites are empty.
   */
  static boolean closes(final int[] rules) {
    if (Arrays.equals(rules, S34) || Arrays.equals(rules, S35)) {
      return new ShiftOverflow(rules).localRules();
    }
    if (Arrays.equals(rules, S33)) {
      return new ShiftOverflow(rules).local33();
    }
    if (!Arrays.equals(rules, S26) && !Arrays.equals(rules, S15)) {
      return false;
    }
    final ShiftOverflow verifier = new ShiftOverflow(S26);
    if (!verifier.local26()) {
      return false;
    }
    if (Arrays.equals(rules, S26)) {
      return verifier.checked("initialization", verifier.initializes(right(0, BLANK, BLANK), left(3, BLANK, "1010" + encodeRight(11))));
    }
    final int[] rename = {4, 2, 0, 1, 3};
    for (int i = 0; i < rules.length; ++i) {
      final int move = rules[i];
      final int mapped = move < 0 ? move : 4 * rename[move >>> 2] + ((move & 3) ^ 1);
      if (S26[2 * rename[i >>> 1] + (i & 1)] != mapped) {
        return false;
      }
    }
    return verifier.checked("#15 initialization", verifier.initializes(right(rename[0], BLANK, BLANK), left(3, BLANK, "1010" + encodeRight(1))));
  }

  // #33 differs only in its marker and reset invariant. Write b(m)=2^w-1-m
  // as above, and let P(n) mean n=1 or n has leading binary digits 11.
  // At E(1,m) assume P(x) for x=b(m), initially x=b(17)=14. The finish
  // rewrite, 2x increments and overflow, then removal of the odd low
  // digit, reach E(x,16*2^w+6) with gap 16*2^w-7.
  // Hence the reset invariant at E(n,m) is P(n), b(m)=3A+r, A a power
  // of two, and 2n<=r<A (initially n=x, A=4*2^w, r=A-7).
  // For n>1 write n=2^k(1+2n'), u=2^k-1. Then n'>0, n'<n and P(n').
  // The fixed-width counter uses 2u of the gap before eating the k ones
  // and the separator. With v=m+2u and t=4v (the marker is two zero
  // digits), those rewrites give m'=4^k(t+1)+1. Appending two one digits
  // to t preserves the two no-overflow hypotheses for the eater: the
  // first successor has two trailing zero bits. The new gap is 3A'+r'
  // with A'=4^(k+1) A and r'=4^(k+1)(r-2u)+3*4^k-2. Since
  // 2(n-u)<=r-2u<=A-1 and 0<=3*4^k-2<4^(k+1), 2n'<=r'<A'.
  // The reset therefore reaches E(1,m') with P(b(m')) again, and the
  // initialization, finish, and overflow paths establish positive progress.

  // #26 has two separators a. E0 uses K, E1 uses J: K=00.J and L=000.J,
  // with the high padding taken from the blank tail even at n=0. For
  // n=T(1+2n'), T=2^k, the reset encodings start with k zero digits
  // (0000)^k, then 0010.K(n') in E0 or 10.K(n') in E1. After u=T-1
  // ordinary increments v=m+u remains in the old width. The k one
  // digits are eaten, appending 11 on the right each time; the final
  // K/J rewrite gives H=T^2(4v+2a+1), marker 1 and right counter H
  // for E0; for E1 k>=1, so the low pair 10 of R(H) starts the new
  // marker 0, giving E0 with H/2. Both have n'<n.
  // All increments are legal if T<=b(m). Write f=b(v)>=1. The new
  // b+1 is T^2(4f+3-2a), or half that for E1, as 4v+2a+1 has the
  // same width as 4 times the old counter. Both restore the invariant
  // m'>=2 and b(m')+1=powerOfTwo*(1+2q), q>=2. For E0 assume
  // n<=b(m) as in #34/35; then n'<=f<=b(m'). E1 instead has k>=1 and
  // n<=4b(m); then n'<2b(m)/T<=b(m), and b(m')>=2T^2 f-1>=b(m).
  // Thus both reset paths finish at D(0,a',m') with the invariant.
  // From D0 with a=0, the ordinary increment/overflow gives E0 with
  // n=b(m)+1<=2^w-1, the gap of the new counter 2^w. This works for
  // any m>0. For a=1, assume the invariant and set Y=2^(w-1), q>=2
  // from x=b(m)+1=T(1+2q). The overflow gives E1 with n=2x and
  // m'=Y. Since x<=Y and x>=5, 2x<=4(Y-1) and 2T<=2Y/5<=Y-1,
  // exactly the two E1 hypotheses. Every round includes the overflow.
}
