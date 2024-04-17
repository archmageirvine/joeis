package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063038 a(n) = floor(n*sqrt(n)) - d(n), where d(n) is the number of divisors function.
 * @author Sean A. Irvine
 */
public class A063038 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(3).sqrt().subtract(Functions.SIGMA0.z(mN));
  }
}
