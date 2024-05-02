package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A063475 Sum_{d | H(n)} d^2, where H(n) is the Half-Totient function (A023022).
 * @author Sean A. Irvine
 */
public class A063475 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return Jaguar.factor(Functions.PHI.z(++mN).divide2()).sigma2();
  }
}
