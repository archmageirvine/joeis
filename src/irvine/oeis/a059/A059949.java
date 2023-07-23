package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059949 Number of 8-block bicoverings of an n-set.
 * @author Sean A. Irvine
 */
public class A059949 extends A059443 {

  {
    setOffset(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 8);
  }
}
