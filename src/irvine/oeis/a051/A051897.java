package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051897 Values of n such that 90n+11, 90n+13, 90n+17, 90n+19 are all primes.
 * @author Sean A. Irvine
 */
public class A051897 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.multiply(90);
      if (m.add(11).isProbablePrime() && m.add(13).isProbablePrime() && m.add(17).isProbablePrime() && m.add(19).isProbablePrime()) {
        return mN;
      }
    }
  }
}
