package irvine.oeis.a361;

import irvine.math.z.Z;

/**
 * A361405 Number of graphs with loops on 2n unlabeled vertices with n loops.
 * @author Gregory Morse
 */
public class A361405 extends A361404 {
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return compute(2 * mN, mN);
  }
}
