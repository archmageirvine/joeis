package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060597 Number of tilings of the 6-dimensional zonotope constructed from D vectors.
 * @author Sean A. Irvine
 */
public class A060597 extends A060596 {

  {
    setOffset(6);
  }

  private int mN = 5;

  @Override
  public Z next() {
    return count(7, ++mN);
  }
}
