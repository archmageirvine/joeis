package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a318.A318795;

/**
 * A052372 Number of nonnegative integer 6 X 6 matrices with sum of elements equal to n, under row and column permutations.
 * @author Sean A. Irvine
 */
public class A052372 extends A318795 {

  private int mN = -1;

  @Override
  public Z next() {
    return m(6, 6, ++mN);
  }
}
