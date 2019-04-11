package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013967 <code>a(n) =</code> sigma_19(n), the sum of the 19th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013967 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(19);
  }
}
