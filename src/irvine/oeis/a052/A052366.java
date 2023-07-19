package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a318.A318795;

/**
 * A052366 Number of nonnegative integer 4 X 4 matrices with sum of elements equal to n, under row and column permutations.
 * @author Sean A. Irvine
 */
public class A052366 extends A318795 {

  /** Construct the sequence. */
  public A052366() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return m(4, 4, ++mN);
  }
}
