package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000079.
 * @author Sean A. Irvine
 */
public class A000079 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
    } else {
      mN = mN.multiply2();
    }
    return mN;
  }
}
