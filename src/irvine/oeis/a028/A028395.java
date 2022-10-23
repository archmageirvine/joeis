package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028395 Iterate the map in A006368 starting at 14.
 * @author Sean A. Irvine
 */
public class A028395 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(14);
    } else {
      mA = mA.multiply(3);
      if (mA.isEven()) {
        mA = mA.divide2();
      } else {
        mA = mA.add(2).divide(4);
      }
    }
    return mA;
  }
}

