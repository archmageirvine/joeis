package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018826 Numbers n such that n is a substring of its square when both are written in base 2.
 * @author Sean A. Irvine
 */
public class A018826 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  protected int base() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().toString(base()).contains(mN.toString(base()))) {
        return mN;
      }
    }
  }
}
