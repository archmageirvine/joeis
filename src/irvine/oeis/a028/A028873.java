package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028873 Numbers n such that n^2 - 3 is prime.
 * @author Sean A. Irvine
 */
public class A028873 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(3).isProbablePrime()) {
        return mN;
      }
    }
  }
}
