package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071139 Numbers k such that the sum of distinct primes dividing k is divisible by the largest prime dividing k.
 * @author Sean A. Irvine
 */
public class A071139 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.z(++mN).mod(Functions.GPF.l(mN)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
