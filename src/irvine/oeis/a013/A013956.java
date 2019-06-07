package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013956 <code>sigma_8(n)</code>, the sum of the 8th powers of the divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A013956 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(8);
  }
}
