package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057582 Maximal numbers of codewords in mixed code with 4 binary coordinates and n ternary coordinates with Hamming distance 3.
 * @author Sean A. Irvine
 */
public class A057582 extends A057574 {

  private int mN = -1;

  @Override
  public Z next() {
    a(4, ++mN, 3, reset(), 1);
    return Z.valueOf(mBest);
  }
}
