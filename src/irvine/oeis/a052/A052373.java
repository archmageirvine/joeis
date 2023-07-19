package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a318.A318795;

/**
 * A052373 Number of nonnegative integer 7 X 7 matrices with sum of elements equal to n, under row and column permutations.
 * @author Sean A. Irvine
 */
public class A052373 extends A318795 {

  /** Construct the sequence. */
  public A052373() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return m(7, 7, ++mN);
  }
}
