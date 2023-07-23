package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059950 Number of 9-block bicoverings of an n-set.
 * @author Sean A. Irvine
 */
public class A059950 extends A059443 {

  {
    setOffset(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 9);
  }
}
