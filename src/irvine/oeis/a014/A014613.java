package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014613 Numbers that are products of 4 primes.
 * @author Sean A. Irvine
 */
public class A014613 extends Sequence1 {

  private long mN = 15;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
