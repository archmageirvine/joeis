package irvine.oeis.a351;

import irvine.math.z.Z;

/**
 * A351363 Number of necklaces with n black and n white beads with at least four consecutive black beads.
 * @author Gregory Morse
 */
public class A351363 extends A351358 {
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return t(2 * mN, mN);
  }
}
