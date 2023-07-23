package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059951 Number of 10-block bicoverings of an n-set.
 * @author Sean A. Irvine
 */
public class A059951 extends A059443 {

  {
    setOffset(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 10);
  }
}
