package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050150 Odd numbers with prime number of divisors.
 * @author Sean A. Irvine
 */
public class A050150 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Jaguar.factor(mN).sigma0().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
