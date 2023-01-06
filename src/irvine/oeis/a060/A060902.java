package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060902 Number of ordered factorizations of the identity permutation in the symmetric group S_n into 2n-2 transpositions such that the factors generate S_n.
 * @author Sean A. Irvine
 */
public class A060902 extends Sequence2 {

  private Z mF = Z.TWO;
  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    mF = mF.multiply(2 * mN - 2).multiply(2 * mN - 3);
    return mF.multiply(Z.valueOf(mN).pow(mN - 3));
  }
}
