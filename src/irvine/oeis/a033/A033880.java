package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033880 Abundance of n, or (sum of divisors of <code>n) - 2n</code>.
 * @author Sean A. Irvine
 */
public class A033880 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Cheetah.factor(++mN).sigma().subtract(2 * mN);
  }
}
