package irvine.oeis.a058;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A058627 Numbers n such that phi(n) = product of the digits of n.
 * @author Sean A. Irvine
 */
public class A058627 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z prod = ZUtils.digitProduct(mN);
      if (!prod.isZero() && prod.equals(Euler.phi(mN))) {
        return mN;
      }
    }
  }
}
