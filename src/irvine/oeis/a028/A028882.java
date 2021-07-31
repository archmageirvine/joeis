package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028882 Numbers n such that n^2 - 7 is prime.
 * @author Sean A. Irvine
 */
public class A028882 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(7).isProbablePrime()) {
        return mN;
      }
    }
  }
}
