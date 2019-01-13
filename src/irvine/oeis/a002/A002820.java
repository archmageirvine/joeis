package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a005.A005327;

/**
 * A002820.
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
