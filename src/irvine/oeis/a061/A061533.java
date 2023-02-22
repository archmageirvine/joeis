package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061533 Limiting sequence of digits in A061584, starting with least significant digit.
 * @author Sean A. Irvine
 */
public class A061533 extends A061584 {

  private int mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    if (++mN >= mA.length()) {
      super.next();
    }
    return Z.valueOf(mA.charAt(mA.length() - mN) - '0');
  }
}
