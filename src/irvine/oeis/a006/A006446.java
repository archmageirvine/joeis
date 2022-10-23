package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006446 Numbers k such that floor(sqrt(k)) divides k.
 * @author Sean A. Irvine
 */
public class A006446 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(mN.sqrt()).isZero()) {
        return mN;
      }
    }
  }
}
