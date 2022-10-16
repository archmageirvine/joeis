package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059948 Number of 7-block bicoverings of an n-set.
 * @author Sean A. Irvine
 */
public class A059948 extends A059443 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 7);
  }
}
