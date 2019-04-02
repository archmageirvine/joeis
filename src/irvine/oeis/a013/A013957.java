package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013957 sigma_9(n), the sum of the 9th powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013957 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(9);
  }
}
