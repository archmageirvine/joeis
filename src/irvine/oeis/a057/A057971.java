package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057971 Number of 5 X n binary matrices with exactly 2 singleton columns up to row and column permutations.
 * @author Sean A. Irvine
 */
public class A057971 extends A057968 {

  /** Construct the sequence. */
  public A057971() {
    super(2);
  }

  private int mN = 1;

  @Override
  public Z next() {
    return b(++mN, 2);
  }
}
