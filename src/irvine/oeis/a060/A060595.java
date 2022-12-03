package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060595 Number of tilings of the 3-dimensional zonotope constructed from D vectors.
 * @author Sean A. Irvine
 */
public class A060595 extends A060596 {

  {
    setOffset(3);
  }

  private int mN = 2;

  @Override
  public Z next() {
    return count(4, ++mN);
  }
}
