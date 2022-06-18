package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057577 Maximal numbers of codewords in mixed code with n binary coordinates and 4 ternary coordinates with Hamming distance 3.
 * @author Sean A. Irvine
 */
public class A057577 extends A057574 {

  private int mN = -1;

  @Override
  public Z next() {
    a(++mN, 4, 3, reset(), 1);
    return Z.valueOf(mBest);
  }
}
