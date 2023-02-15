package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061430 Geometric mean of the digits is an integer: k-digit numbers such that the product of the digits is a number of the form m^k.
 * @author Sean A. Irvine
 */
public class A061430 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ZERO;
    }
    while (true) {
      long t = ++mN;
      Z prod = Z.ONE;
      int digits = 0;
      while (t != 0) {
        prod = prod.multiply(t % 10);
        t /= 10;
        ++digits;
      }
      prod.root(digits);
      if (prod.auxiliary() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

