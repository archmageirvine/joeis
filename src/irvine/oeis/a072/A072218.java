package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072218 Consider the Reverse and Add! problem (cf. A001127); of all the n-digit numbers N which eventually reach a palindrome, pick that number N which takes the greatest number of steps to converge (in case of a tie, pick the smallest N); sequence gives palindrome that is reached.
 * @author Sean A. Irvine
 */
public class A072218 extends Sequence1 {

  private long mLimit = 1;
  private long mN = 0;

  private static Z res(Z n) {
    while (true) {
      n = Functions.REVERSE_AND_ADD.z(n);
      if (Predicates.PALINDROME.is(n)) {
        return n;
      }
    }
  }

  @Override
  public Z next() {
    mLimit *= 10;
    long bestSteps = 0;
    long best = 0;
    while (mN < mLimit) {
      final long cnt = A072216.countSteps(Z.valueOf(mN));
      if (cnt > bestSteps) {
        bestSteps = cnt;
        best = mN;
      }
      ++mN;
    }
    return res(Z.valueOf(best));
  }
}
