package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A005592.
 * @author Sean A. Irvine
 */
public class A005592 extends A000032 {

  private boolean mFirst = true;
  @Override
  public Z next() {
    super.next();
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().subtract(1);
  }
}

