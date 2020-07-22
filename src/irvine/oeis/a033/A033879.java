package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033879 Deficiency of n, or <code>2n -</code> (sum of divisors of <code>n)</code>.
 * @author Sean A. Irvine
 */
public class A033879 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN).subtract(Cheetah.factor(mN).sigma());
  }
}
