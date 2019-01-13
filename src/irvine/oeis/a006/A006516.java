package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006516.
 * @author Sean A. Irvine
 */
public class A006516 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(1).shiftLeft(mN - 1);
  }
}
