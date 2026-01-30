package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083475 Consider the set of all the numbers n*k where 1 &lt;= k &lt;= n. Then a(n) = number of palindromic members of this set.
 * @author Sean A. Irvine
 */
public class A083475 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Predicates.PALINDROME.is(k * mN)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
