package irvine.oeis.a086;

import java.util.Arrays;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A086818 a(1) = 111, a(n) = the smallest squarefree number &gt; a(n-1) which contains all the digits of a(n-1).
 * @author Sean A. Irvine
 */
public class A086818 extends Sequence1 {

  private int[] mDigits = {1, 1, 1};
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    // First try with current digits
    final Permutation perm = new Permutation(mDigits);
    int[] p;
    Z best = null;
    while ((p = perm.next()) != null) {
      if (p[0] != 0) {
        final Z t = Permutation.permToZ(p);
        if (t.compareTo(mPrev) > 0 && (best == null || t.compareTo(best) < 0) && Predicates.SQUARE_FREE.is(t)) {
          best = t;
        }
      }
    }
    if (best != null) {
      mPrev = best;
      return best;
    }
    // We need another digit
    int[] bestDigits = null;
    for (int d = 0; d < 10; ++d) {
      final int[] digits = Arrays.copyOf(mDigits, mDigits.length + 1);
      digits[digits.length - 1] = d;
      final Permutation permD = new Permutation(digits);
      int[] pd;
      while ((pd = permD.next()) != null) {
        if (pd[0] != 0) {
          final Z t = Permutation.permToZ(pd);
          if (t.compareTo(mPrev) > 0 && (best == null || t.compareTo(best) < 0) && Predicates.SQUARE_FREE.is(t)) {
            best = t;
            bestDigits = digits;
          }
        }
      }
    }
    if (best == null) {
      throw new RuntimeException();
    }
    mDigits = bestDigits;
    mPrev = best;
    return best;
  }
}

