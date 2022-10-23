package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005985 Length of longest trail (i.e., path with all distinct edges) on the edges of an n-cube.
 * @author Sean A. Irvine
 */
public class A005985 extends Sequence0 {

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
