package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030458 Primes formed by concatenating n with n+1.
 * @author Sean A. Irvine
 */
public class A030458 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z p;
      if (mN % 3 != 1 && mN % 5 != 4 && (p = new Z(mN + String.valueOf(mN + 1))).isProbablePrime()) {
        return p;
      }
    }
  }
}
