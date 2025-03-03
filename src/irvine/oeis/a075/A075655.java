package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075655 Numbers n such that n + product of prime factors of n = (n+1) + product of prime factors of (n+1).
 * @author Sean A. Irvine
 */
public class A075655 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.RAD.l(++mN) == Functions.RAD.l(mN + 1) + 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
