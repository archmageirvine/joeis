package irvine.oeis.a056;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056809 Numbers k such that k, k+1 and k+2 are products of two primes.
 * @author Sean A. Irvine
 */
public class A056809 extends Sequence1 {

  private long mN = 32;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.SEMIPRIME.is(++mN) && Predicates.SEMIPRIME.is(mN + 1) && Predicates.SEMIPRIME.is(mN + 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}

