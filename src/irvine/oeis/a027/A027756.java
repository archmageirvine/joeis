package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027756.
 * @author Sean A. Irvine
 */
public class A027756 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(mN).add(7).isProbablePrime()) {
        return mN;
      }
    }
  }
}
