package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A057126 Numbers n such that 2 is a square mod n.
 * @author Sean A. Irvine
 */
public class A057126 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.isQuadraticResidue(Z.TWO, mN)) {
        return mN;
      }
    }
  }
}
