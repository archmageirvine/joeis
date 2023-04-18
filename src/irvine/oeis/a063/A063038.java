package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063038 Floor(n*sqrt(n)) - d(n), where d(n) is the number of divisors function.
 * @author Sean A. Irvine
 */
public class A063038 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(3).sqrt().subtract(Jaguar.factor(mN).sigma0());
  }
}
