package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A384502 Maximum number of distinct prime factors in an n-digit number, n &gt; 3, where its set of distinct prime factors can be partitioned into two equal-sum subsets, each containing at least two elements.
 * @author Sean A. Irvine
 */
public class A384502 extends AbstractSequence {

  private Z mN = Z.valueOf(100);

  /** Construct the sequence. */
  public A384502() {
    super(4);
  }

  private boolean is(final long[] p, final int k, final long sum, final int posCount) {
    if (k == p.length) {
      return sum == 0 && posCount > 1 && p.length - posCount > 1;
    }
    return is(p, k + 1, sum + p[k], posCount + 1) || is(p, k + 1, sum - p[k], posCount);
  }

  private boolean is(final Z lim, final int cnt) {
    final long[] p = new long[cnt];
    Z s = Z.ONE.shiftLeft(cnt).subtract(1);
    while (true) {
      Z t = s;
      Z prod = Z.ONE;
      for (int k = 0, j = 1; !t.isZero(); ++j, t = t.divide2()) {
        if (t.testBit(0)) {
          p[k] = Functions.PRIME.l(j);
          prod = prod.multiply(p[k]);
          ++k;
        }
      }
      if (prod.compareTo(lim) >= 0) {
        return false;
      }
      if (is(p, 0, 0, 0)) {
        return true;
      }
      s = Functions.SWIZZLE.z(s);
    }
  }

  @Override
  public Z next() {
    mN = mN.multiply(10);
    final Z lim = mN.multiply(10);
    Z prod = Z.ONE;
    int j = 1;
    while (prod.compareTo(lim) < 0) {
      prod = prod.multiply(Functions.PRIME.l(j++));
    }
    for (int max = --j; max >= 0; --max) {
      if (is(lim, max)) {
        return Z.valueOf(max);
      }
    }
    throw new RuntimeException();
  }
}

