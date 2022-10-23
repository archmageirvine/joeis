package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036299 Binary Fibonacci (or rabbit) sequence.
 * @author Sean A. Irvine
 */
public class A036299 extends Sequence0 {

  private String mA = null;
  private String mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = "1";
        return Z.ONE;
      }
      mB = "10";
    } else {
      final String t = mB + mA;
      mA = mB;
      mB = t;
    }
    return new Z(mB);
  }
}

