package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073499 Numbers n such that n^(n+1) + (n+1)^n is prime.
 * @author Sean A. Irvine
 */
public class A073499 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(mN + 1).add(Z.valueOf(mN + 1).pow(mN)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
