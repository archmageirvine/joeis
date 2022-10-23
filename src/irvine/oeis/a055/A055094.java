package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A055094 Binary encoding of quadratic residue set of n. L(1/n) is the most significant bit, L(n-1/n) is the least significant bit, i.e., the rows of A055088 interpreted as binary numbers.
 * @author Sean A. Irvine
 */
public class A055094 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z res = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      res = res.multiply2();
      if (ZUtils.isQuadraticResidue(Z.valueOf(k), Z.valueOf(mN))) {
        res = res.add(1);
      }
    }
    return res;
  }
}
