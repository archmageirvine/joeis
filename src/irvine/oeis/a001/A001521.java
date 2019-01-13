package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001521.
 * @author Sean A. Irvine
 */
public class A001521 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(mA.add(1)).multiply2().sqrt();
    }
    return mA;
  }
}
