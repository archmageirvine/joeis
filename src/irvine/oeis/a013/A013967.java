package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013967 <code>a(n) = sigma_19(n)</code>, the sum of the <code>19th</code> powers of the divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A013967 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(19);
  }
}
