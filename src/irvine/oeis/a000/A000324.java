package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000324.
 * @author Sean A. Irvine
 */
public class A000324 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.FIVE;
    } else {
      mA = mA.square().subtract(mA.shiftLeft(2)).add(4);
    }
    return mA;
  }
}

