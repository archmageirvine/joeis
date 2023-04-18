package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063044 Collatz-2 (A063041) trajectory starting at 29.
 * @author Sean A. Irvine
 */
public class A063044 extends A063041 {

  private Z mA = null;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(29) : collatz2(mA);
    return mA;
  }
}
