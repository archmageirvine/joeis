package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054463 Numbers k such that (k+1)^k - k^(k-1) is prime.
 * @author Sean A. Irvine
 */
public class A054463 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN + 1).pow(mN).subtract(Z.valueOf(mN).pow(mN - 1));
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
