package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075985 Numbers k such that k^5 + 6^k is prime.
 * @author Sean A. Irvine
 */
public class A075985 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.SIX.pow(++mN).add(Z.valueOf(mN).pow(5));
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
