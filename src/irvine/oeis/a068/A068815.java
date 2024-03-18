package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068815 Primes with a 4 followed by 1's.
 * @author Sean A. Irvine
 */
public class A068815 extends Sequence1 {

  private Z mA = Z.FOUR;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(10).add(1);
      if (mA.isProbablePrime()) {
        return mA;
      }
    }
  }
}
