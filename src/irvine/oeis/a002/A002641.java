package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002641 Numbers n such that <code>(n^2 + n + 1)/7</code> is prime.
 * @author Sean A. Irvine
 */
public class A002641 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long m = mN.mod(7);
      if ((m == 2 || m == 4) && mN.square().add(mN).add(1).divide(7).isPrime()) {
        return mN;
      }
    }
  }
}
