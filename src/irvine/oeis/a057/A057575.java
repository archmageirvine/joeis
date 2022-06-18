package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057575 Maximal numbers of codewords in mixed code with n binary coordinates and 2 ternary coordinates with Hamming distance 3.
 * @author Sean A. Irvine
 */
public class A057575 extends A057574 {

  private int mN = -1;

  @Override
  public Z next() {
    a(++mN, 2, 3, reset(), 1);
    return Z.valueOf(mBest);
  }
}
