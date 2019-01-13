package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004171.
 * @author Sean A. Irvine
 */
public class A004171 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.shiftLeft(2);
    return mA;
  }
}
