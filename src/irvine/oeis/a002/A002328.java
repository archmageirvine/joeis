package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002328 Numbers n such that n^2 - n - 1 is prime.
 * @author Sean A. Irvine
 */
public class A002328 implements Sequence {

  protected Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().subtract(mN).subtract(1);
      if (p.isProbablePrime()) {
        return mN;
      }
    }
  }
}
