package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053605 Total multiplicity of the eigenvalue 0 in the spectra of the n^(n-2) labeled trees on n vertices.
 * @author Sean A. Irvine
 */
public class A053605 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 2; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN - 1, k - 1).multiply(Z.valueOf(mN).pow(mN - k)).multiply(Z.valueOf(k).pow(k - 2)));
    }
    return Z.valueOf(mN).pow(mN - 1).subtract(sum.multiply2());
  }
}
