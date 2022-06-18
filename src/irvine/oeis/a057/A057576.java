package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057576 Maximal numbers of codewords in mixed code with n binary coordinates and 3 ternary coordinates with Hamming distance 3.
 * @author Sean A. Irvine
 */
public class A057576 extends A057574 {

  private int mN = -1;

  @Override
  public Z next() {
    a(++mN, 3, 3, reset(), 1);
    return Z.valueOf(mBest);
  }
}
