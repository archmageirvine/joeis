package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061429 Geometric mean of the digits = 6. In other words, the product of the digits is = 6^k where k is the number of digits.
 * @author Sean A. Irvine
 */
public class A061429 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      long t = ++mN;
      Z prod = Z.ONE;
      int digits = 0;
      while (t != 0) {
        prod = prod.multiply(t % 10);
        t /= 10;
        ++digits;
      }
      if (prod.equals(Z.SIX.pow(digits))) {
        return Z.valueOf(mN);
      }
    }
  }
}

