package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019999.
 * @author Sean A. Irvine
 */
public class A019999 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = 1;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(mN).shiftLeft(mN - 2);
  }
}
