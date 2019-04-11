package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002643 Numbers n such that <code>(n^2 + n + 1)/19</code> is prime.
 * @author Sean A. Irvine
 */
public class A002643 implements Sequence {

  private Z mN = Z.SIX;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long m = mN.mod(19);
      if ((m == 7 || m == 11) && mN.square().add(mN).add(1).divide(19).isPrime()) {
        return mN;
      }
    }
  }
}
