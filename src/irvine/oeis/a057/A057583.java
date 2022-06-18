package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057583 Maximal numbers of codewords in mixed code with 5 binary coordinates and n ternary coordinates with Hamming distance 3.
 * @author Sean A. Irvine
 */
public class A057583 extends A057574 {

  private int mN = -1;

  @Override
  public Z next() {
    a(5, ++mN, 3, reset(), 1);
    return Z.valueOf(mBest);
  }
}
