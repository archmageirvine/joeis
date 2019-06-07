package irvine.oeis.a013;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013971 <code>a(n) =</code> sum of 23rd powers of divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A013971 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma(23);
  }
}
