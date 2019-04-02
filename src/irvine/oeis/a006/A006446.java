package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006446 Numbers n such that floor(sqrt(n)) divides n.
 * @author Sean A. Irvine
 */
public class A006446 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(mN.sqrt()).equals(Z.ZERO)) {
        return mN;
      }
    }
  }
}
