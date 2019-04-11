package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002640 Numbers n such that <code>(n^2 + n + 1)/3</code> is prime.
 * @author Sean A. Irvine
 */
public class A002640 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().add(mN).add(1).divide(3).isPrime()) {
        return mN;
      }
    }
  }
}
