package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085763 Number of palindromes between n and 2n (inclusive).
 * @author Sean A. Irvine
 */
public class A085763 extends Sequence1 {

  private long mN = 0;
  private long mCount = 1;

  @Override
  public Z next() {
    for (long k = 2 * mN + 1; k <= 2 * (mN + 1); ++k) {
      if (Predicates.PALINDROME.is(k)) {
        ++mCount;
      }
    }
    if (Predicates.PALINDROME.is(mN)) {
      --mCount;
    }
    ++mN;
    return Z.valueOf(mCount);
  }
}
