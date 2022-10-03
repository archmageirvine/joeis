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

  protected Z nimProduct(final long base, final long n, final long m) {
    Z sum = Z.ZERO;
    Z am = Z.ONE;
    long a = n;
    while (a != 0) {
      long b = m;
      Z bm = am;
      while (b != 0) {
        sum = nimsum(10, sum, bm.multiply((a * b) % base));
        b /= base;
        bm = bm.multiply(base);
      }
      a /= base;
      am = am.multiply(base);
    }
    return sum;
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

