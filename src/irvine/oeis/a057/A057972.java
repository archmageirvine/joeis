package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057972 Number of 5 X n binary matrices with 3 unit columns up to row and column permutations.
 * @author Sean A. Irvine
 */
public class A057972 extends A057968 {

  private int mN = 2;

  @Override
  public Z next() {
    return b(++mN, 3);
  }
}
