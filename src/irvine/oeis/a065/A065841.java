package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065841 a(1) = 1; a(2) = 2; a(3) = 3; a(n) is concatenation of a(n-3), a(n-2) and a(n-1).
 * @author Sean A. Irvine
 */
public class A065841 extends Sequence1 {

  private String mA = null;
  private String mB = null;
  private String mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = "1";
        return Z.ONE;
      }
      if (mB == null) {
        mB = "2";
        return Z.TWO;
      }
      mC = "3";
      return Z.THREE;
    }
    final String t = mA + mB + mC;
    mA = mB;
    mB = mC;
    mC = t;
    return new Z(t);
  }
}

