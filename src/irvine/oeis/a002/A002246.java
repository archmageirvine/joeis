package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A002246.
 * @author Sean A. Irvine
 */
public class A002246 extends A000010 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      super.next();
      mFirst = false;
      return Z.THREE;
    }
    return super.next().shiftLeft(2);
  }
}
