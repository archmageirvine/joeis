package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002706.
 * @author Sean A. Irvine
 */
public class A002706 extends A002653 {

  private A002656 mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new A002656();
      return super.next();
    } else {
      return super.next().subtract(mA.next().multiply(6));
    }
  }
}
