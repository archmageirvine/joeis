package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013966 <code>a(n) = sigma_18(n)</code>, the sum of the <code>18th</code> powers of the divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A013966 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(18);
  }
}
