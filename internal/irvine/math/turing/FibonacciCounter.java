package irvine.math.turing;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Symbolic replay of the Double Fibonacci Counter proof (BusyCoq/Skelet10.v).
 * @author Gregory Morse
 */
final class FibonacciCounter {
  private static final int[] RULES = {7, 1, 8, 3, 19, 14, 10, 12, -1, 5};
  private static final String BLANK = "!";
  private static final String VARIABLE = "*";

  private FibonacciCounter() { }

  private static final class Position {
    private final int mQ;
    private final boolean mRight;
    private final String mL;
    private final String mR;

    private Position(final int q, final boolean right, final String l, final String r) {
      this.mQ = q;
      this.mRight = right;
      this.mL = trim(l);
      this.mR = trim(r);
    }

    @Override
    public boolean equals(final Object other) {
      if (!(other instanceof Position)) {
        return false;
      }
      final Position pos = (Position) other;
      return mQ == pos.mQ && mRight == pos.mRight && mL.equals(pos.mL) && mR.equals(pos.mR);
    }

    @Override
    public int hashCode() {
      return Objects.hash(mQ, mRight, mL, mR);
    }
  }

  private static String trim(final String side) {
    int i = side.length() - 1;
    if (side.charAt(i) != '!') {
      return side;
    }
    while (i > 0 && side.charAt(i - 1) == '0') {
      --i;
    }
    return side.substring(0, i) + BLANK;
  }

  private static String carry(final String digits) {
    final char c = digits.charAt(0);
    if (c == '!') {
      return "1!";
    } else if (c == '0') {
      return "1" + digits.substring(1);
    } else if (c == '1') {
      return "00" + carry(digits.substring(1));
    }
    return "+" + digits;
  }

  private static String increment(final String digits) {
    final char c = digits.charAt(0);
    if (c == '!') {
      return "1!";
    } else if (c == '0') {
      return carry(digits.substring(1));
    } else if (c == '1') {
      return "0" + carry(digits.substring(1));
    }
    throw new IllegalArgumentException("Need a digit case for increment");
  }

  private static String encode(final String digits, final boolean right) {
    final StringBuilder out = new StringBuilder();
    int i = 0;
    while (digits.charAt(i) == '0' || digits.charAt(i) == '1') {
      final boolean set = digits.charAt(i++) == '1';
      out.append(right ? set ? "10" : "0" : set ? "0101" : "00");
    }
    return trim(out.append(digits.charAt(i) == '!' ? BLANK : (right ? "Z" : "T") + digits.substring(i)).toString());
  }

  private static Position boundary(final String n) {
    final char top = n.charAt(0);
    final String left = top == '!' ? BLANK : (top == '1' ? "01" : "") + encode(n.substring(1), false);
    return new Position(3, false, left, encode(increment(n), true));
  }

  private static Position step(final Position p) {
    final String source = p.mRight ? p.mR : p.mL;
    final char bit = source.charAt(0);
    if (bit != '0' && bit != '1' && bit != '!') {
      return null;
    }
    final int rule = RULES[2 * p.mQ + (bit == '1' ? 1 : 0)];
    if (rule < 0) {
      return null;
    }
    final String rest = bit == '!' ? BLANK : source.substring(1);
    final String l = p.mRight ? p.mL : rest;
    final String r = p.mRight ? rest : p.mR;
    final String write = (rule & 2) == 0 ? "0" : "1";
    return (rule & 1) != 0 ? new Position(rule >>> 2, true, write + l, r) : new Position(rule >>> 2, false, l, write + r);
  }

  private static Position rightLemma(final Position p, final String n) {
    return p.mQ == 1 && p.mRight && p.mL.startsWith("1") && p.mR.equals(encode(n, true))
      ? new Position(3, false, p.mL.substring(1), encode(carry(n), true)) : null;
  }

  private static Position leftLemma(final Position p, final String n) {
    return p.mQ == 3 && !p.mRight && p.mR.startsWith("11") && p.mL.equals(encode(n, false))
      ? new Position(0, true, encode(carry(n), false), p.mR.substring(2)) : null;
  }

  private static boolean advance(final Position start, final Position goal, final List<String> right, final List<String> left) {
    // Explicit one-step rewrites and previously justified local lemmas only.
    // Start unmarked so that reaching the same position still requires progress.
    final ArrayDeque<Position> queue = new ArrayDeque<>();
    final Set<Position> seen = new HashSet<>();
    queue.add(start);
    while (!queue.isEmpty() && seen.size() < 400) {
      final Position p = queue.removeFirst();
      visit(step(p), seen, queue);
      for (final String n : right) {
        visit(rightLemma(p, n), seen, queue);
      }
      for (final String n : left) {
        visit(leftLemma(p, n), seen, queue);
      }
      if (seen.contains(goal)) {
        return true;
      }
    }
    return false;
  }

  private static void visit(final Position p, final Set<Position> seen, final ArrayDeque<Position> queue) {
    if (p != null && seen.add(p)) {
      queue.addLast(p);
    }
  }

  static boolean closes(final int[] rules) {
    if (!java.util.Arrays.equals(rules, RULES)) {
      return false;
    }
    for (final String n : List.of(BLANK, "0*", "1*")) {
      final List<String> induction = n.equals(BLANK) ? List.of() : List.of(VARIABLE);
      if (!advance(new Position(1, true, "1l", encode(n, true)), new Position(3, false, "l", encode(carry(n), true)),
        induction, List.of())
        || !advance(new Position(3, false, encode(n, false), "11r"), new Position(0, true, encode(carry(n), false), "r"),
        List.of(), induction)) {
        return false;
      }
    }
    for (final String n : List.of(BLANK, "0!", "00*", "01*", "1*")) {
      final List<String> lemmaArgs = List.of(BLANK, "0!", "1!", VARIABLE, "+*", "0*", "1*", "0+*", "1+*");
      if (!advance(boundary(n), boundary(increment(n)), lemmaArgs, lemmaArgs)) {
        return false;
      }
    }
    return advance(new Position(0, true, BLANK, BLANK), boundary(BLANK), List.of(), List.of());
  }
}
