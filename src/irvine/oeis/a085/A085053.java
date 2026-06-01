package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085053 Number of primes of the form n*k+1, where k=1 to n.
 * @author Sean A. Irvine
 */
public class A085053 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Predicates.PRIME.is(k * mN + 1)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
