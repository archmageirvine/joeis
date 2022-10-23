package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A047224 Smallest k&gt;n where n is a square modulo k.
 * @author Sean A. Irvine
 */
public class A047224 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z k = mN;
    while (true) {
      k = k.add(1);
      if (ZUtils.isQuadraticResidue(mN, k)) {
        return k;
      }
    }
  }
}
