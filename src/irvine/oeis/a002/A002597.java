package irvine.oeis.a002;

import irvine.math.z.Z;


/**
 * A002597.
 * @author Sean A. Irvine
 */
public class A002597 extends A002599 {

  private boolean mFirst = true;

  @Override
  protected int limit() {
    return 3;
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next();
  }
}
