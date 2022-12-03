package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060600 Number of tilings of the 8-dimensional zonotope constructed from D vectors.
 * @author Sean A. Irvine
 */
public class A060600 extends A060596 {

  {
    setOffset(8);
  }

  private int mN = 7;

  @Override
  public Z next() {
    return count(9, ++mN);
  }
}
