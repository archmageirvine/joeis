package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075981 Numbers n such that |2^n - n^5| is prime.
 * @author Sean A. Irvine
 */
public class A075981 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.ONE.shiftLeft(++mN).subtract(Z.valueOf(mN).pow(5)).abs();
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
