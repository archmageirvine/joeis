package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000311;

/**
 * A006351.
 * @author Sean A. Irvine
 */
public class A006351 extends A000311 {

  {
    super.next();
    super.next();
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().multiply2();
  }
}

