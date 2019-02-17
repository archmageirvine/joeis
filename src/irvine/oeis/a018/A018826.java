package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018826.
 * @author Sean A. Irvine
 */
public class A018826 implements Sequence {

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
