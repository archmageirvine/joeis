package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060184.
 * @author Sean A. Irvine
 */
public class A060186 extends A060184 {

  private int mN = 5;
  {
    setOffset(3); // I think this should really be 5 or 6
  }

  @Override
  public Z next() {
    return getGf(++mN, 3).coeff(mN);
  }
}
