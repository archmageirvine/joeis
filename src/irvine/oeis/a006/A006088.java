package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006088 a(n) = (2^n + 2) a(n-1) (kissing number of Barnes-Wall lattice in dimension 2^n).
 * @author Sean A. Irvine
 */
public class A006088 extends Sequence0 {

  private Z mA = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(mN).add(2));
    }
    return mA;
  }
}

