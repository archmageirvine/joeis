package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001317.
 * @author Sean A. Irvine
 */
public class A001317 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.xor(mA.multiply2());
    }
    return mA;
  }
}
