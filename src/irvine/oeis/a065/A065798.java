package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065798 Numbers k such that k^k - k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A065798 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (n.pow(mN).subtract(mN + 1).isProbablePrime()) {
        return n;
      }
    }
  }
}
