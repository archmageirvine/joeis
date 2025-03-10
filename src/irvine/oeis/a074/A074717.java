package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074717 Least k such that floor(2^n/k) is prime.
 * @author Sean A. Irvine
 */
public class A074717 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply2();
    long k = 0;
    while (true) {
      if (mA.divide(++k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
