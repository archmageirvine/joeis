package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a033.A033950;

/**
 * A036898 List of pairs of consecutive refactorable numbers.
 * @author Sean A. Irvine
 */
public class A036898 extends A033950 {

  private Z mA = Z.NEG_ONE;
  private Z mNext = null;

  @Override
  public Z next() {
    if (mNext != null) {
      final Z r = mNext;
      mNext = null;
      return r;
    }
    while (true) {
      final Z n = super.next();
      if (n.subtract(1).equals(mA)) {
        final Z r = mA;
        mA = n;
        mNext = n;
        return r;
      }
      mA = n;
    }
  }
}
