package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005713.
 * @author Sean A. Irvine
 */
public class A005713 implements Sequence {

  private String mA = "0";
  private String mB = "11";
  private int mPos = -1;

  @Override
  public Z next() {
    if (++mPos >= mB.length()) {
      final String t = mB + mA;
      mA = mB;
      mB = t;
    }
    return mB.charAt(mPos) == '0' ? Z.ZERO : Z.ONE;
  }
}

