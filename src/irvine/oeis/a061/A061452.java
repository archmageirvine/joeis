package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061452 n*bigomega(n)^n, where bigomega(n) is the number of prime divisors of n, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A061452 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(++mN).bigOmega()).pow(mN).multiply(mN);
  }
}

