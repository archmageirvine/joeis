package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013880.
 * @author Sean A. Irvine
 */
public class A013880 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(4096) : mA.shiftLeft(20);
    return mA;
  }
}
