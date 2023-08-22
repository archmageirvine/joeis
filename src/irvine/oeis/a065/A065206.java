package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A065206 One 'Reverse and Add' step is needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A065206 extends Sequence1 {

  private Z mN = Z.NINE;
  private final long mSteps;

  protected A065206(final int steps) {
    mSteps = steps;
  }

  /** Construct the sequence. */
  public A065206() {
    this(1);
  }

  private boolean is(Z n) {
    for (int k = 0; k < mSteps; ++k) {
      if (ZUtils.isPalindrome(n, 10)) {
        return false;
      }
      n = n.add(ZUtils.reverse(n));
    }
    return ZUtils.isPalindrome(n, 10);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}
