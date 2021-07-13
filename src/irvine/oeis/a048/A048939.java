package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a014.A014575;

/**
 * A048939 10-digit vampire numbers (definition 2).
 * @author Sean A. Irvine
 */
public class A048939 extends A014575 {

  private Z mA = super.next();

  @Override
  protected long start() {
    return 1000174288;
  }

  @Override
  public Z next() {
    if (mA == null) {
      return null;
    }
    final Z res = mA;
    mA = super.next();
    if (mA.toString().length() > 10) {
      mA = null;
    }
    return res;
  }
}

