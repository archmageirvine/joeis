package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072140.
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
