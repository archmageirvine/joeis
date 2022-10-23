package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A063543 a(n) = n - product of nonzero digits of n.
 *
 * @author Karsten Knuth
 */
public class A063543 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    final Z result = mN.subtract(ZUtils.digitNZProduct(mN, 10));
    mN = mN.add(Z.ONE);
    return result;
  }
}
