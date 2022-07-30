package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058225.
 * @author Sean A. Irvine
 */
public class A058227 implements Sequence {

  private Z mA = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    mA = mA.add(Z.ONE.shiftLeft(++mN).subtract(1).multiply(4L * mN));
    return mA;
  }
}
