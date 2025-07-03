package irvine.oeis.a078;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078512 Carmichael numbers that are unrestricted Perrin pseudoprimes.
 * @author Sean A. Irvine
 */
public class A078512 extends Sequence1 {

  private long mN = 7045248120L;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (Predicates.PERRIN.is(n) && Predicates.CARMICHAEL.is(n)) {
        return n;
      }
    }
  }
}

