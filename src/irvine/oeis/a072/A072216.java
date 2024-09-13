package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072216 Consider the Reverse and Add! problem (cf. A001127); of all the n-digit numbers N which eventually reach a palindrome, pick that number N which takes the greatest number of steps to converge (in case of a tie, pick the smallest N); sequence gives values of N.
 * @author Sean A. Irvine
 */
public class A072216 extends Sequence1 {

  private static final long SEARCH_LIMIT = Long.parseLong(System.getProperty("oeis.heuristic-limit", "1000"));
  private long mLimit = 1;
  private long mN = 0;

  static long countSteps(Z n) {
    int cnt = 0;
    while (true) {
      if (++cnt == SEARCH_LIMIT) {
        return 0;
      }
      n = Functions.REVERSE_AND_ADD.z(n);
      if (Predicates.PALINDROME.is(n)) {
        return cnt;
      }
    }
  }

  @Override
  public Z next() {
    mLimit *= 10;
    long bestSteps = 0;
    long best = 0;
    while (mN < mLimit) {
      final long cnt = countSteps(Z.valueOf(mN));
      if (cnt > bestSteps) {
        bestSteps = cnt;
        best = mN;
      }
      ++mN;
    }
    return Z.valueOf(best);
  }
}
