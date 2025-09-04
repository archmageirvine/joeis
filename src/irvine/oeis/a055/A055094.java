package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A055094 Binary encoding of quadratic residue set of n. L(1/n) is the most significant bit, L(n-1/n) is the least significant bit, i.e., the rows of A055088 interpreted as binary numbers.
 * @author Sean A. Irvine
 */
public class A055094 extends Sequence1 implements DirectSequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

  @Override
  public Z a(final Z n) {
    Z res = Z.ZERO;
    for (Z k = Z.ONE; k.compareTo(n) < 0; k = k.add(1)) {
      res = res.multiply2();
      if (ZUtils.isQuadraticResidue(k, n)) {
        res = res.add(1);
      }
    }
    return res;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
