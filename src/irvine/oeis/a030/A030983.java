package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A030983 Number of rooted noncrossing trees with n nodes such that root has degree 1 and the child of the root has degree at least 2.
 * @author Sean A. Irvine
 */
public class A030983 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return Binomial.binomial(3 * ++mN - 8, mN - 4).multiply(19 * mN - 31).divide(2 * mN - 3).divide(mN - 1);
  }
}
