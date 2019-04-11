package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013966 <code>a(n) =</code> sigma_18(n), the sum of the 18th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013966 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(18);
  }
}
