package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013963 <code>a(n) = sigma_15(n)</code>, the sum of the <code>15th</code> powers of the divisors of n.
 * @author Sean A. Irvine
 */
public class A013963 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(15);
  }
}
