package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087572 Smallest prime of the form n + (n-1) + (n-2) + ...(n-k), k &lt; n, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A087572 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = mN;
    long sum = 0;
    while (k > 0) {
      sum += k;
      if (Predicates.PRIME.is(sum)) {
        return Z.valueOf(sum);
      }
      --k;
    }
    return Z.ZERO;
  }
}
