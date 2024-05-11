package irvine.oeis.a065;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065531 Number of palindromes in all base b representations for n, for 2&lt;=b&lt;=n.
 * @author Sean A. Irvine
 */
public class A065531 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    long cnt = 0;
    for (long k = 2; k <= mN; ++k) {
      if (Predicates.PALINDROME.is(k, n)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

