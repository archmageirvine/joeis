package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060598 Number of tilings of the 7-dimensional zonotope constructed from D vectors.
 * @author Sean A. Irvine
 */
public class A060598 extends A060596 {

  {
    setOffset(7);
  }

  private int mN = 6;

  @Override
  public Z next() {
    return count(8, ++mN);
  }
}
