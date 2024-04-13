package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A065206 One 'Reverse and Add' step is needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A065206 extends Sequence1 {

  private Z mN = Z.ZERO;
  private final int mBase;
  private final long mSteps;

  protected A065206(final int base, final int steps) {
    mBase = base;
    mSteps = steps;
  }

  protected A065206(final int steps) {
    this(10, steps);
  }

  /** Construct the sequence. */
  public A065206() {
    this(1);
  }

  private boolean is(Z n) {
    for (int k = 0; k < mSteps; ++k) {
      if (ZUtils.isPalindrome(n, mBase)) {
        return false;
      }
      n = n.add(Functions.REVERSE.z(mBase, n));
    }
    return ZUtils.isPalindrome(n, mBase);
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
