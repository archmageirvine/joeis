package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393944 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A393944 extends Sequence0 {

  // After Felix Huber

  private long mN = -1;

  @Override
  public Z next() {
    final long p = Functions.PRIME_PI.l(++mN);
    final long s = Functions.SQRT.l(mN);
    final long m = Functions.MIN.l(p, s, mN - p - s);
    return Integers.SINGLETON.sum(0, m, k -> Binomial.binomial(p, k).multiply(Binomial.binomial(s, k)).multiply(Binomial.binomial(mN - p - s, k)));
  }
}
