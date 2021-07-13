package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a014.A014575;

/**
 * A048938 8-digit vampire numbers (definition 2).
 * @author Sean A. Irvine
 */
public class A048938 extends A014575 {

  private static final Z LAST = Z.valueOf(96977920);
  private Z mA = super.next();

  @Override
  protected long start() {
    return 10025010;
  }

  @Override
  public Z next() {
    if (mA == null) {
      return null;
    }
    final Z res = mA;
    mA = super.next();
    if (LAST.equals(mA)) {
      mA = null;
    }
    return res;
  }
}

