package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a004.A004514;

/**
 * A059692 Table of carryless products i * j, i&gt;=0, j&gt;=0, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A059692 extends A004514 {

  private int mN = -1;
  private int mM = 0;

  protected Z nimProduct(final int base, final Z n, final long m) {
    Z sum = Z.ZERO;
    Z am = Z.ONE;
    Z a = n;
    while (!a.isZero()) {
      long b = m;
      Z bm = am;
      while (b != 0) {
        sum = nimSum(base, sum, bm.multiply(a.multiply(b).mod(base)));
        b /= base;
        bm = bm.multiply(base);
      }
      a = a.divide(base);
      am = am.multiply(base);
    }
    return sum;
  }

  protected Z nimProduct(final int base, final long n, final long m) {
    return nimProduct(base, Z.valueOf(n), m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return nimProduct(10, mN - mM, mM);
  }
}

