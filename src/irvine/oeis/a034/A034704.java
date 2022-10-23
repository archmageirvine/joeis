package irvine.oeis.a034;

import java.util.Stack;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A034704 Largest number that can be made using only the digits of n, exponentiation and concatenation.
 * @author Sean A. Irvine
 */
public class A034704 extends Sequence1 {

  private long mN = 0;
  private long mLim = 10;
  private int mLength = 1;

  @Override
  public Z next() {
    if (++mN == mLim) {
      // We are moving to one more digit in the numbers
      mLim *= 10;
      ++mLength;
    }
    final int[] digits = new int[mLength];
    long t = mN;
    for (int k = 0; k < digits.length; ++k) {
      digits[k] = (int) (t % 10);
      t /= 10;
    }
    // For mLength digits we need mLength - 1 operations of either concatenation
    // or exponentiation.  We could use bits in a number from 0 to 1 << mLength
    // to control the operations.  We also need to allow the digits to be
    // considered in any order.
    Z max = Z.ZERO;
    final Permutation perm = new Permutation(digits);
    int[] p;
    while ((p = perm.next()) != null) {
      final Stack<Z> stack = new Stack<>();
      for (int operations = 0; operations < 1 << (mLength - 1); ++operations) {
        for (final int d : p) {
          stack.push(Z.valueOf(d));
        }
        for (int k = 1, o = operations; k < p.length; ++k, o >>>= 1) {
          final Z a = stack.pop();
          final Z b = stack.pop();
          stack.push((o & 1) == 0 ? a.multiply(10).add(b) : b.pow(a).max(a.pow(b)));
        }
        assert stack.size() == 1;
        final Z res = stack.pop();
        if (res.compareTo(max) > 0) {
          max = res;
        }
      }
    }
    return max;
  }
}

