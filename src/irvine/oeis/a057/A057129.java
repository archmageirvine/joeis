package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A057129 -4 is a square mod n.
 * @author Sean A. Irvine
 */
public class A057129 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.isQuadraticResidue(mN.subtract(Z.FOUR), mN)) {
        return mN;
      }
    }
  }
}
