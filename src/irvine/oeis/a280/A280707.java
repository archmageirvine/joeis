package irvine.oeis.a280;

import irvine.math.z.Z;
import irvine.oeis.a063.A063041;

/**
 * A280707 Collatz-2 (A063041) trajectory starting at 47.
 * @author Sean A. Irvine
 */
public class A280707 extends A063041 {

  private Z mA = null;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(47) : collatz2(mA);
    return mA;
  }
}
