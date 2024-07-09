package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A071277 a(1) = 1; a(n) = smallest palindrome which is a nontrivial multiple of n palindromes (repetitions allowed).
 * @author Sean A. Irvine
 */
public class A071277 extends Sequence1 {

  private final DirectSequence mPalindromes = DirectSequence.create(new A002113().skip(2)); // ignore 0 and 1
  private int mN = 0;

  private boolean is(final Z t, final int prev, final int cnt) {
    if (cnt == mN) {
      return Z.ONE.equals(t);
    }
    for (int j = prev; j >= 0; --j) {
      final Z[] qr = t.divideAndRemainder(mPalindromes.a(j));
      if (qr[1].isZero() && is(qr[0], j, cnt + 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    int k = -1;
    while (true) {
      if (is(mPalindromes.a(++k), k - 1, 0)) {
        return mPalindromes.a(k);
      }
    }
  }
}
