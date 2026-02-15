package irvine.oeis.a393;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence3;

/**
 * A393198 a(n) is the least value of m such that n has a prime number of ones in its base m expansion.
 * @author Sean A. Irvine
 */
public class A393198 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    for (int b = 2; b < mN; ++b) {
      if (Predicates.PRIME.is(ZUtils.digitCounts(mN, b)[1])) {
        return Z.valueOf(b);
      }
    }
    return Z.NEG_ONE;
  }
}
