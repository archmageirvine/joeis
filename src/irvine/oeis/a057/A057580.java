package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057580 Maximal numbers of codewords in mixed code with 2 binary coordinates and n ternary coordinates with Hamming distance 3.
 * @author Sean A. Irvine
 */
public class A057580 extends A057574 {

  private int mN = -1;

  @Override
  public Z next() {
    a(2, ++mN, 3, reset(), 1);
    return Z.valueOf(mBest);
  }
}
