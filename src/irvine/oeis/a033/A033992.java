package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033992 Numbers that are divisible by exactly three different primes.
 * @author Sean A. Irvine
 */
public class A033992 extends Sequence1 {

  private long mN = 29;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(++mN) == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
