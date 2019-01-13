package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002971.
 * @author Sean A. Irvine
 */
public class A002971 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().multiply(4).add(25).isProbablePrime()) {
        return mN;
      }
    }
  }
}
