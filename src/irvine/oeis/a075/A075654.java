package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075654 Numbers n such that n + sum of prime factors of n = (n+1) + sum of prime factors of (n+1).
 * @author Sean A. Irvine
 */
public class A075654 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.l(++mN) == Functions.SOPF.l(mN + 1) + 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
