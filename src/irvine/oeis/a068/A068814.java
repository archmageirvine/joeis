package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068814 Primes with a 2 followed by (possibly zero) 1's.
 * @author Sean A. Irvine
 */
public class A068814 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    while (true) {
      mA = mA == null ? Z.TWO : mA.multiply(10).add(1);
      if (mA.isProbablePrime()) {
        return mA;
      }
    }
  }
}
