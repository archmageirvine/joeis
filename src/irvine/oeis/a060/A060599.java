package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060599 Number of tilings of the 5-dimensional zonotope constructed from D vectors.
 * @author Sean A. Irvine
 */
public class A060599 extends A060596 {

  {
    setOffset(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    return count(6, ++mN);
  }
}
