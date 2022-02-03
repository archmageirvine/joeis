package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054463 Numbers n such that (n+1)^n - n^(n-1) is prime.
 * @author Sean A. Irvine
 */
public class A054463 implements Sequence {

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
