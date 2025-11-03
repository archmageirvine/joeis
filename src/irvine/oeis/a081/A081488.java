package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081488 (Sum of n-th row of triangle in A081485)/n.
 * @author Sean A. Irvine
 */
public class A081488 extends A081487 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
