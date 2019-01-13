package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002384.
 * @author Sean A. Irvine
 */
public class A002384 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.add(1).multiply(mN).add(1);
      if (m.isProbablePrime()) {
        return mN;
      }
    }
  }
}
