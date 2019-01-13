package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008653.
 * @author Sean A. Irvine
 */
public class A008653 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Cheetah.factor(3 * mN).sigma().subtract(Cheetah.factor(mN).sigma().multiply(3)).multiply(12);
  }
}
