package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002731 Numbers n such that (n^2 + 1)/2 is prime.
 * @author Sean A. Irvine
 */
public class A002731 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (mN.square().add(1).divide2().isProbablePrime()) {
        return mN;
      }
    }
  }
}
