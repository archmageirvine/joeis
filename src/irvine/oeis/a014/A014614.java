package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014614 Numbers that are products of 5 primes (or 5-almost primes, a generalization of semiprimes).
 * @author Sean A. Irvine
 */
public class A014614 extends Sequence1 {

  private long mN = 31;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
