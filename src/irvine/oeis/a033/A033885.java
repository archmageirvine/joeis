package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033885 <code>a(n) = 3*n -</code> sum of divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A033885 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(3 * ++mN).subtract(Cheetah.factor(mN).sigma());
  }
}
