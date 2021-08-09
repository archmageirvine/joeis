package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050150 Odd numbers with prime number of divisors.
 * @author Sean A. Irvine
 */
public class A050150 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Cheetah.factor(mN).sigma0().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
