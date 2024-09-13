package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072217 Consider the Reverse and Add! problem (cf. A001127); of all the n-digit numbers N which eventually reach a palindrome, pick that number N which takes the greatest number of steps to converge (in case of a tie, pick the smallest N); sequence gives number of steps N takes to converge.
 * @author Sean A. Irvine
 */
public class A072217 extends Sequence1 {

  private long mLimit = 1;
  private long mN = 0;

  @Override
  public Z next() {
    mLimit *= 10;
    long bestSteps = 0;
    while (mN < mLimit) {
      final long cnt = A072216.countSteps(Z.valueOf(mN));
      if (cnt > bestSteps) {
        bestSteps = cnt;
      }
      ++mN;
    }
    return Z.valueOf(bestSteps);
  }
}
