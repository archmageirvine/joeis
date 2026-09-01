package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057970 Number of 5 X n binary matrices with exactly 1 singleton column up to row and column permutations.
 * @author Sean A. Irvine
 */
public class A057970 extends A057968 {

  /** Construct the sequence. */
  public A057970() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return b(++mN, 1);
  }
}
