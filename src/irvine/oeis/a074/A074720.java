package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A074720 Least k such that floor(3^n/2^k) is prime.
 * @author Sean A. Irvine
 */
public class A074720 extends Sequence2 {

  private Z mA = Z.THREE;

  @Override
  public Z next() {
    mA = mA.multiply(3);
    long k = 0;
    Z t = Z.ONE;
    while (true) {
      ++k;
      t = t.multiply2();
      if (mA.divide(t).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
