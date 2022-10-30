package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060184.
 * @author Sean A. Irvine
 */
public class A060185 extends A060184 {

  private int mN = 2;
  {
    setOffset(3);
  }

  @Override
  public Z next() {
    return getGf(++mN, 2).coeff(mN);
  }
}
