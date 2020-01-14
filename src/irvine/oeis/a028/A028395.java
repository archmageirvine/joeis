package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028395.
 * @author Sean A. Irvine
 */
public class A028395 implements Sequence {

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

