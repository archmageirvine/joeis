package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033993 Numbers that are divisible by exactly four different primes.
 * @author Sean A. Irvine
 */
public class A033993 extends Sequence1 {

  private long mN = 209;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(++mN) == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
