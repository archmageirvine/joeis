package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059837 Diagonal T(s,s) of triangle A059836.
 * @author Sean A. Irvine
 */
public class A059837 extends A059836 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
