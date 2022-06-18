package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057578 Maximal numbers of codewords in ternary code of length n with Hamming distance 3.
 * @author Sean A. Irvine
 */
public class A057578 extends A057574 {

  private int mN = -1;

  @Override
  public Z next() {
    a(0, ++mN, 3, reset(), 1);
    return Z.valueOf(mBest);
  }
}
