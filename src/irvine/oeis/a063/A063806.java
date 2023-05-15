package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063806 Numbers with a prime number of proper divisors.
 * @author Sean A. Irvine
 */
public class A063806 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma0().subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
