package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002644 Numbers n such that <code>(n^2 + n + 1)/21</code> is prime.
 * @author Sean A. Irvine
 */
public class A002644 implements Sequence {

  private Z mN = Z.SIX;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long m = mN.mod(21);
      if ((m == 4 || m == 16) && mN.square().add(mN).add(1).divide(21).isPrime()) {
        return mN;
      }
    }
  }
}
