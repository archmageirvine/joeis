package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054211 Numbers n such that n concatenated with n-1 is prime.
 * @author Sean A. Irvine
 */
public class A054211 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (new Z(mN + String.valueOf(mN - 1)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

