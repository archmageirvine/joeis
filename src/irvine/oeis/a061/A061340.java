package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061340 a(n) = n*omega(n)^n where omega(n) is the number of distinct prime divisors of n.
 * @author Sean A. Irvine
 */
public class A061340 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(++mN).omega()).pow(mN).multiply(mN);
  }
}
