package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008658.
 * @author Sean A. Irvine
 */
public class A008658 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Cheetah.factor(mN).sigma(3).add((mN & 1) == 0 ? Cheetah.factor(mN / 2).sigma(3).multiply(4) : Z.ZERO).multiply(48);
  }
}
