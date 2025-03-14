package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075979 Numbers k such that k^5 + 2^k is prime.
 * @author Sean A. Irvine
 */
public class A075979 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.ONE.shiftLeft(++mN).add(Z.valueOf(mN).pow(5));
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
