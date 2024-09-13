package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072164 Numbers k &gt;= 1 such that f(k) = k^k - (k-1)^(k-1) is prime.
 * @author Sean A. Irvine
 */
public class A072164 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).pow(mN).subtract(Z.valueOf(mN - 1).pow(mN - 1));
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
