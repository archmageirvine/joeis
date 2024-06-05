package irvine.oeis.a070;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070250.
 * @author Sean A. Irvine
 */
public class A070250 extends Sequence1 {

  private int mTargetSum;
  private final TreeSet<Z> mA = new TreeSet<>();
  private final TreeSet<Z> mSolutions = new TreeSet<>();
  {
    mA.add(Z.ZERO);
  }

  protected A070250(final int targetSum) {
    mTargetSum = targetSum;
  }

  /** Construct the sequence. */
  public A070250() {
    this(10);
  }

  protected boolean accept(final Z t) {
    return t.isProbablePrime();
  }

  @Override
  public Z next() {
    while (mSolutions.size() < 2 || Functions.DIGIT_LENGTH.i(mSolutions.first()) == Functions.DIGIT_LENGTH.i(mSolutions.last())) {
      final Z t = mA.pollFirst();
      final int sum = 2 * Functions.DIGIT_SUM.i(t); // because t is the "left" half of the palindrome
      // Queue up possible extensions
      final Z t10 = t.multiply(10);
      for (int k = 0; sum + 2 * k <= mTargetSum; ++k) {
        final Z v = t10.add(k);
        if (!v.isZero()) {
          mA.add(v);
        }
      }

      // Because of even off effects we can encounter solutions out of order.
      // The mSolutions set is used to ensure correct ordering of the result.
      final int remaining = mTargetSum - sum;
      if (remaining <= 9) {
        // We could conceivably form a palindrome with what we have
        final String s = t.toString();
        final StringBuilder reverse = new StringBuilder(t.isZero() ? "" : s).reverse();
        if (remaining == 0) {
          // Potential even length palindrome
          final Z candidate = new Z(s + reverse);
          if (accept(candidate)) {
            mSolutions.add(candidate);
          }
        }
        // Try for odd length palindrome
        final Z c = new Z(s + remaining + reverse);
        if (accept(c)) {
          mSolutions.add(c);
        }
      }
    }
    return mSolutions.pollFirst();
  }
}
