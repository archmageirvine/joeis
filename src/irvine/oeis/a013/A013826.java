package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013826.
 * @author Sean A. Irvine
 */
public class A013826 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply(243);
    return mA;
  }
}
