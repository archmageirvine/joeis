package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081418 A000720 applied to Pascal-triangle as follows: C(pi(n),pi(j)), j=0..n and n=0,1,2,...
 * @author Sean A. Irvine
 */
public class A081418 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(Functions.PRIME_PI.l(mN), Functions.PRIME_PI.l(mM));
  }
}
