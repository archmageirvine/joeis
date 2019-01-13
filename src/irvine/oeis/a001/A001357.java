package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001357.
 * @author Sean A. Irvine
 */
public class A001357 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply2();
    }
    return new Z(mA.toString(9));
  }
}
