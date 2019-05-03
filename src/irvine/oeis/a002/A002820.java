package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a005.A005327;

/**
 * A002820 Number of <code>n X n</code> invertible binary matrices A such that <code>A+I</code> is invertible.
 * @author Sean A. Irvine
 */
public class A002820 extends A005327 {

  {
    super.next();
  }

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN * (mN - 1) / 2);
  }
}
