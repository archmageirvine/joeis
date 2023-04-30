package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063476 Sum_{d |C(n)} d^2, where C(n) is the Cototient function n - phi(n) (A051953).
 * @author Sean A. Irvine
 */
public class A063476 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Jaguar.factor(mN - Euler.phiAsLong(mN)).sigma2();
  }
}
