package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068817 Numbers n such that n concatenated with n 1's is a prime.
 * @author Sean A. Irvine
 */
public class A068817 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      Z t = n;
      for (long k = 0; k < mN; ++k) {
        t = t.multiply(10).add(1);
      }
      if (t.isProbablePrime()) {
        return n;
      }
    }
  }
}
