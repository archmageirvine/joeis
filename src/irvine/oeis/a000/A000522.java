package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000522.
 * @author Sean A. Irvine
 */
public class A000522 implements Sequence {

  private Z mA = Z.ZERO;
  private int mN = -1;

  @Override
  public Z next() {
    mA = mA.multiply(++mN).add(1);
    return mA;
  }
}
