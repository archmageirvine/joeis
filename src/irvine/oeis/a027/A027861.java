package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027861.
 * @author Sean A. Irvine
 */
public class A027861 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(mN.add(1).square()).isProbablePrime()) {
        return mN;
      }
    }
  }
}
