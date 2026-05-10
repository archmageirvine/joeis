package irvine.oeis.a395;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A395561 Smallest positive integer k such that n - k is prime and n + k is composite.
 * @author Sean A. Irvine
 */
public class A395561 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      if (Predicates.PRIME.is(mN - k) && !Predicates.PRIME.is(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}
