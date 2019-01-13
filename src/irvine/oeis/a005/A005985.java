package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005985.
 * @author Sean A. Irvine
 */
public class A005985 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z a = Z.valueOf(mN).shiftLeft(mN + 1);
    if ((mN & 1) == 1) {
      a = a.subtract(Z.ONE.shiftLeft(mN + 1).subtract(4));
    }
    return a.shiftRight(2);
  }
}
