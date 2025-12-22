package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390323 Sum of composite numbers coprime to n in the range 1 &lt; k &lt; n.
 * @author Sean A. Irvine
 */
public class A390323 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 4; k < mN; ++k) {
      if (Functions.GCD.l(k, mN) == 1 && !Predicates.PRIME.is(k)) {
        sum = sum.add(k);
      }
    }
    return sum;
  }
}
