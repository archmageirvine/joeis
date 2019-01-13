package irvine.oeis.a187;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A187272.
 * @author Sean A. Irvine
 */
public class A187272 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Z.valueOf(3L * mN).shiftLeft(mN / 2 - 1) : Z.valueOf(mN).shiftLeft(mN / 2 + 1);
  }
}

