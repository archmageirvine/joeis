package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A057701 Twin lucky numbers: (n,m) are lucky numbers with |n-m|=2.
 * @author Sean A. Irvine
 */
public class A057701 extends A000959 {

  private Z mQ = null;
  private Z mA = super.next();

  @Override
  public Z next() {
    if (mQ != null) {
      final Z t = mQ;
      mQ = null;
      return t;
    }
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).equals(Z.TWO)) {
        mQ = mA;
        return t;
      }
    }
  }
}
