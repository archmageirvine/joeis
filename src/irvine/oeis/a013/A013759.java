package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013759.
 * @author Sean A. Irvine
 */
public class A013759 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(256) : mA.shiftLeft(12);
    return mA;
  }
}
