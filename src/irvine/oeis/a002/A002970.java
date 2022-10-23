package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002970 Numbers n such that 4*n^2 + 9 is prime.
 * @author Sean A. Irvine
 */
public class A002970 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().multiply(4).add(9).isProbablePrime()) {
        return mN;
      }
    }
  }
}
