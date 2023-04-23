package irvine.oeis.a063;

import java.util.HashMap;
import java.util.HashSet;

import irvine.math.IntegerUtils;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A063381 Number of orbits of the group of units of Z/(n) acting naturally on the 4-subsets of Z/(n).
 * @author Sean A. Irvine
 */
public class A063381 extends AbstractSequence {

  // After Robert Israel

  private final Z mBits;
  private int mN;

  protected A063381(final int maxSubset) {
    super(maxSubset);
    mN = maxSubset - 1;
    mBits = Z.ONE.shiftLeft(maxSubset).subtract(1);
  }

  /** Construct the sequence. */
  public A063381() {
    this(4);
  }

  @Override
  public Z next() {
    ++mN;
    final int[] u = new int[(int) Euler.phiAsLong(mN)];
    for (int k = 0, t = 1; t < mN; ++t) {
      if (IntegerUtils.gcd(t, mN) == 1) {
        u[k++] = t;
      }
    }
    final Z limit = Z.ONE.shiftLeft(mN);
    Z s = mBits;
    final HashMap<Z, Z> r = new HashMap<>();
    final HashSet<Z> c = new HashSet<>();
    while (s.compareTo(limit) < 0) {
      c.add(s);
      r.put(s, s);
      s = ZUtils.swizzle(s);
    }
    for (final int k : u) {
      s = mBits;
      while (s.compareTo(limit) < 0) {
        Z us = Z.ZERO;
        Z j = s;
        int t = 0;
        while (!j.isZero()) {
          if (j.isOdd()) {
            us = us.setBit((k * t) % mN);
          }
          j = j.divide2();
          ++t;
        }
        Z v = r.get(us);
        while (!v.equals(r.get(v))) {
          v = r.get(v);
        }
        if (!s.equals(v)) {
          r.put(s, v);
          c.remove(s);
        }
        s = ZUtils.swizzle(s);
      }
    }
    return Z.valueOf(c.size());
  }
}
