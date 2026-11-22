package irvine.math.turing;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Exact identities in two independent nonnegative integer indices.
 * @author Gregory Morse
 */
final class DyadicProof {

  private DyadicProof() {
  }

  static final class Index {
    private final int mX;
    private final int mY;
    private final int mC;

    Index(final int x, final int y, final int c) {
      this.mX = x;
      this.mY = y;
      this.mC = c;
    }

    Index plus(final int n) {
      return new Index(mX, mY, mC + n);
    }

    Index minus(final Index b) {
      return new Index(mX - b.mX, mY - b.mY, mC - b.mC);
    }

    boolean nonnegative() {
      return mX >= 0 && mY >= 0 && mC >= 0;
    }

    boolean nonpositive() {
      return mX <= 0 && mY <= 0 && mC <= 0;
    }

    boolean is(final int k) {
      return mX == 0 && mY == 0 && mC == k;
    }

    boolean same(final Index b) {
      return minus(b).is(0);
    }

    boolean atMost(final Index b) {
      return b.minus(this).nonnegative();
    }

    int parity() {
      if (((mX | mY) & 1) != 0) {
        throw new IllegalArgumentException("Parity was not split");
      }
      return mC & 1;
    }

    @Override
    public String toString() {
      return mX + "x+" + mY + "y+" + mC;
    }
  }

  private static final Index ZERO = new Index(0, 0, 0);

  static Index k(final int n) {
    return ZERO.plus(n);
  }

  private static final class Slope {
    private final int mX;
    private final int mY;

    Slope(final Index e) {
      mX = e.mX;
      mY = e.mY;
    }

    @Override
    public int hashCode() {
      return mX * 31 + mY;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Slope && mX == ((Slope) obj).mX && mY == ((Slope) obj).mY;
    }
  }

  private static final class Term {
    private final Index mExponent;
    private final BigInteger mCoefficient;

    Term(final Index exponent, final BigInteger coefficient) {
      this.mExponent = exponent;
      this.mCoefficient = coefficient;
    }
  }

  static final class Value {
    private final Map<Slope, Term> mTerms = new HashMap<>();

    private void add(Index e, BigInteger c) {
      if (c.signum() == 0) {
        return;
      }
      final Slope s = new Slope(e);
      final Term old = mTerms.remove(s);
      if (old != null) {
        final int off = Math.min(e.mC, old.mExponent.mC);
        c = c.shiftLeft(e.mC - off).add(old.mCoefficient.shiftLeft(old.mExponent.mC - off));
        e = new Index(e.mX, e.mY, off);
      }
      if (c.signum() != 0) {
        final int div = c.getLowestSetBit();
        mTerms.put(s, new Term(e.plus(div), c.shiftRight(div)));
      }
    }

    Value plus(final Value b) {
      final Value v = new Value();
      for (final Term t : mTerms.values()) {
        v.add(t.mExponent, t.mCoefficient);
      }
      for (final Term t : b.mTerms.values()) {
        v.add(t.mExponent, t.mCoefficient);
      }
      return v;
    }

    Value plus(final long n) {
      return plus(num(n));
    }

    Value minus(final Value b) {
      return plus(b.times(-1));
    }

    Value times(final long n) {
      final Value v = new Value();
      for (final Term t : mTerms.values()) {
        v.add(t.mExponent, t.mCoefficient.multiply(BigInteger.valueOf(n)));
      }
      return v;
    }

    Value divide(final Index power) {
      final Value v = new Value();
      for (final Term t : mTerms.values()) {
        v.add(t.mExponent.minus(power), t.mCoefficient);
      }
      return v;
    }

    boolean equal(final Value b) {
      return minus(b).mTerms.isEmpty();
    }

    boolean atLeast(final long n) {
      // Drop only nonnegative variable increments above x=y=0.
      // Integer terms have nonnegative exponents throughout the cone.
      BigInteger low = BigInteger.ZERO;
      for (final Term t : mTerms.values()) {
        final Index e = t.mExponent;
        if (!e.nonnegative() || (e.mX != 0 || e.mY != 0) && t.mCoefficient.signum() < 0) {
          return false;
        }
        low = low.add(t.mCoefficient.shiftLeft(e.mC));
      }
      return low.compareTo(BigInteger.valueOf(n)) >= 0;
    }

    int mod4() {
      int low = 0;
      for (final Term t : mTerms.values()) {
        final Index e = t.mExponent;
        if (!e.nonnegative() || e.mC < 2 && (e.mX != 0 || e.mY != 0)) {
          throw new IllegalArgumentException("Residue was not split");
        }
        if (e.mC < 2) {
          low += t.mCoefficient.intValue() << e.mC;
        }
      }
      return low & 3;
    }

    Value floor() {
      int scale = 0;
      for (final Term t : mTerms.values()) {
        if (!t.mExponent.nonnegative()) {
          scale = Math.max(scale, -t.mExponent.mC);
        }
      }
      final Value v = new Value();
      BigInteger lower = BigInteger.ZERO;
      BigInteger upper = BigInteger.ZERO;
      boolean upperOpen = false;
      for (final Term t : mTerms.values()) {
        final Index e = t.mExponent;
        if (e.nonnegative()) {
          v.add(e, t.mCoefficient);
        } else if (e.nonpositive()) {
          // On the cone, a nonconstant fractional monomial is strictly
          // between 0 and its signed value at x=y=0, including that value.
          final BigInteger end = t.mCoefficient.shiftLeft(scale + e.mC);
          if (e.mX == 0 && e.mY == 0) {
            lower = lower.add(end);
            upper = upper.add(end);
          } else if (end.signum() > 0) {
            upper = upper.add(end);
          } else {
            lower = lower.add(end);
            upperOpen = true;
          }
        } else {
          throw new IllegalArgumentException("Fractional power crosses an unsplit boundary: " + e);
        }
      }
      final BigInteger floored = lower.shiftRight(scale);
      final BigInteger high = (upperOpen ? upper.subtract(BigInteger.ONE) : upper).shiftRight(scale);
      if (!floored.equals(high)) {
        throw new IllegalArgumentException("Floor is not uniform on this cone");
      }
      v.add(ZERO, floored);
      return v;
    }

    Value nearest(final Index divisor) {
      if (!divisor.minus(k(1)).nonnegative()) {
        throw new IllegalArgumentException("Expected a positive shift");
      }
      return plus(pow(divisor.plus(-1))).divide(divisor).floor();
    }

    @Override
    public String toString() {
      final StringBuilder s = new StringBuilder();
      for (final Term t : mTerms.values()) {
        s.append(t.mCoefficient).append("*2^(").append(t.mExponent).append(") ");
      }
      return s.length() == 0 ? "0" : s.toString();
    }
  }

  static Value num(final long n) {
    final Value v = new Value();
    v.add(ZERO, BigInteger.valueOf(n));
    return v;
  }

  static Value pow(final Index p) {
    final Value v = new Value();
    v.add(p, BigInteger.ONE);
    return v;
  }

  /** Universal arithmetic certificate for the Skelet #17 ladder. */
  static final class Ladder {
    private Ladder() { }

    private static void require(final boolean ok, final String obligation) {
      if (!ok) {
        throw new IllegalArgumentException(obligation);
      }
    }

    private static void same(final Value actual, final Value expected, final String obligation) {
      require(actual.equal(expected), obligation + ": " + actual + " != " + expected);
    }

    private static Value a(final Index w) {
      return pow(w.plus(-1));
    }

    private static void guards(final Value a, final Value low, final Value second) {
      require(low.atLeast(0) && a.times(2).plus(-4).minus(low).atLeast(0)
        && second.atLeast(2) && a.times(3).plus(-2).minus(second).atLeast(0)
        && ((low.mod4() | second.mod4()) & 1) == 0, "two-halving guards");
    }

    private static Value rung(final Index w, final Index j) {
      return j.is(0) || w.atMost(j) ? num(0) : pow(w.minus(j));
    }

    // Vector just before the exceptional return that overflows instead of halving twice.
    private static Value late(final Index w, final Index j) {
      if (j.is(0)) {
        return a(w).times(2).plus(-4);
      } else if (j.is(1)) {
        return a(w).times(3);
      } else if (j.atMost(w.plus(-1))) {
        return pow(w.minus(j)).times(3).plus(-2 + 2 * j.parity());
      }
      return num(j.same(w) ? 2 : 0);
    }

    // Virtual regular empty state after overflow, before its mandatory Zero.
    private static Value overflow(final Index w, final Index j) {
      if (j.is(0)) {
        return num(0);
      } else if (j.is(1)) {
        return a(w).times(4).plus(-4);
      } else if (j.atMost(w.plus(-1))) {
        return pow(w.minus(j).plus(2)).plus(-2 * j.parity());
      }
      return num(j.same(w) || j.same(w.plus(1)) ? 2 : 0);
    }

    private static Value returnAt(final Index w, final Index j, final boolean fromOverflow) {
      final Index width = fromOverflow ? w.plus(2) : w;
      final Value a = a(width);
      final Value h1 = a.plus(-1); // The two initial states have a0 = 0.
      final Value h2 = fromOverflow ? a.plus(-2) : a;
      if (j.is(0)) {
        final Value second = fromOverflow ? overflow(w, k(2)) : rung(w, k(2));
        return second.plus(a.divide(k(1))).minus(h1.nearest(k(1)).times(2));
      }
      final Index shifted = j.plus(2);
      return (fromOverflow ? overflow(w, shifted) : rung(w, shifted)).plus(shifted.same(width) ? 1 : 0)
        .plus(a.times(2).plus(-1).nearest(shifted)).minus(h1.nearest(j.plus(1)).times(2)).plus(h2.nearest(j).times(2));
    }

    private static void coordinate(final Index w, final Index j) {
      final Value a = a(w);
      if (j.atMost(w)) {
        final boolean interior = !j.is(0) && j.atMost(w.plus(-1));
        require(!interior || rung(w, j).atLeast(2) && late(w, j).atLeast(2), "regular interior at " + w + ", " + j);
        same(returnAt(w, j, false), rung(w, j).plus(j.same(w) ? 2 : 0), "initial empty return at " + w + ", " + j);

        // First group traverses w,w-2,...,1. The next four groups
        // traverse [1], [2,0], [0], [1]. A final group adds one at 1.
        final int prefix = j.parity() + (j.is(0) ? 2 : j.is(1) ? 2 : j.is(2) ? 1 : 0);
        final Index divisor = j.is(0) ? k(0) : j.plus(-1);
        final Value visits = a.plus(-2).divide(divisor).floor().minus(num(2).divide(divisor).floor());
        require(visits.atLeast(0), "nonnegative valuation-block count");
        same(rung(w, j).plus(visits.plus(prefix + (j.is(1) ? 1 : 0)).times(2)), late(w, j),
          "cumulative valuation-block count at " + w + ", " + j);
      }

      // Zero, decrement to 3, halve to 1, increment to 4A-1.
      // Increments between consecutive Gray values add the endpoint
      // differences of the nearest-integer counters. At 4A-1 only
      // the highest coordinate is odd, so (with a0=0) overflow applies.
      if (!j.is(0) && j.atMost(w.plus(1))) {
        final Index shifted = j.plus(1);
        final Value pre = late(w, shifted).plus(shifted.same(w) ? 1 : 0)
          .plus(a.times(2).plus(-1).nearest(shifted)).minus(num(3).nearest(shifted))
          .plus(a.times(4).plus(-1).nearest(j)).minus(num(1).nearest(j));
        same(pre.plus(j.same(w.plus(1)) ? 1 : 0), overflow(w, j), "overflow bridge at " + w + ", " + j);
        require((pre.mod4() & 1) == (j.same(w.plus(1)) ? 1 : 0), "ready to overflow");
      }

      require(j.is(0) || !j.atMost(w.plus(1)) || overflow(w, j).atLeast(2), "regular post-overflow interior");
      same(returnAt(w, j, true), overflow(w, j).plus(j.same(w) ? 2 : 0), "first post-overflow return at " + w + ", " + j);
      final int chain = j.atMost(w) ? j.parity() : 0;
      same(overflow(w, j).plus(2 * chain + (j.is(1) ? 2 : 0)), rung(w.plus(2), j),
        "final two groups at " + w + ", " + j);
    }

    /** Covers odd w >= 3 and every coordinate 0 <= j <= w+2. */
    static int verify() {
      int cases = 0;
      for (int j = 0; j <= 5; ++j, ++cases) {
        coordinate(k(3), k(j));
      }
      final Index broad = new Index(2, 0, 5);
      for (int j = 0; j <= 2; ++j, ++cases) {
        coordinate(broad, k(j));
      }
      // Interior: j has either parity and the difference w-j is at least
      // three; its parity is the unique one for which w remains odd.
      for (int j0 = 3; j0 <= 4; ++j0, ++cases) {
        final int gap = 3 + ((j0 + 3) % 2 == 0 ? 1 : 0);
        coordinate(new Index(2, 2, j0 + gap), new Index(2, 0, j0));
      }
      for (int off = -2; off <= 2; ++off, ++cases) {
        coordinate(broad, broad.plus(off));
      }
      milestones(a(new Index(2, 0, 3)));
      return cases;
    }

    private static void milestones(final Value a) {
      require(a.atLeast(4) && a.mod4() == 0, "odd-width power of two");
      guards(a, num(0), a);
      // Following the first odd chain, its predecessor counters are
      // (h1,h2)=(A-1,A), and its root is 1. Each next chain changes just
      // the low counter named by the parity of its target, and the
      // predecessor h's are those before that last low-counter change.
      Value low = num(0), second = a.plus(2);
      Value oldH1 = a.plus(-1), oldH2 = a;
      int root = 1;
      for (final int index : new int[] {1, 2, 0, 1}) {
        final Value tested = root == 0 ? oldH1 : oldH2.plus(1);
        final int residue = tested.mod4();
        require(residue != 0 && (residue == 2 ? 1 : 0) + root == index, "prefix carry valuation");
        guards(a, low, second);
        oldH1 = a.plus(-1).minus(low.divide(k(1)));
        oldH2 = a.plus(second).divide(k(1));
        root = index & 1;
        if (root == 0) {
          low = low.plus(2);
        } else {
          second = second.plus(2);
        }
      }
      same(low, num(4), "first checkpoint a0");
      same(second, a.plus(6), "first checkpoint a1");
      same(oldH1, a.plus(-3), "first checkpoint h1");
      same(oldH2, a.plus(2), "first checkpoint h2");
      require(root == 1 && num(2).mod4() == 2 && a.plus(-2).mod4() == 2 && a.plus(-4).atLeast(0), "checkpoint endpoints");

      // All bulk chains increase both low coordinates monotonically.
      // The exact count includes one addition at each low coordinate for
      // each e=3,...,A-2. The terminal low pair therefore bounds every
      // intermediate pair; the controls also show no half is skipped.
      low = low.plus(a.plus(-4).times(2));
      second = second.plus(a.plus(-4).times(2));
      same(low, a.times(2).plus(-4), "last checkpoint a0");
      same(second, a.times(3).plus(-2), "last checkpoint a1");
      guards(a, low, second);
      require((a.times(2).plus(-1).mod4() & 1) == 1, "last low-one carry");
      second = second.plus(2);
      same(a.times(2).plus(-1).minus(low), num(3), "first empty sweep ends at 3");
      same(num(3).divide(k(1)).floor(), num(1), "halve to 1");
      final Value afterHalve = second.plus(a.times(2).plus(-1).nearest(k(1))).minus(num(3).nearest(k(1)));
      same(afterHalve.minus(a.times(4).plus(-1).minus(num(1))), num(0), "upward endpoint has low counter zero");
      require(a.times(4).plus(-1).minus(a).atLeast(0), "upward sweep crosses the well-formedness boundary");
      final Value b = a.times(4);
      guards(b, num(0), b.plus(-4));
      guards(b, num(0), b.plus(-2));
      require((b.plus(-1).mod4() & 1) == 1, "final carry is at index 1");
    }
  }
}
