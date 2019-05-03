package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013962 <code>a(n) = sigma_14(n)</code>, the sum of the <code>14th</code> powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013962 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(14);
  }
}
