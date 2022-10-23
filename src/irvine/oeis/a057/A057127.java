package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A057127 -2 is a square mod n.
 * @author Sean A. Irvine
 */
public class A057127 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.isQuadraticResidue(mN.subtract(Z.TWO), mN)) {
        return mN;
      }
    }
  }
}
