package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028870.
 * @author Sean A. Irvine
 */
public class A028870 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(2).isProbablePrime()) {
        return mN;
      }
    }
  }
}
