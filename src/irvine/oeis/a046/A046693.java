package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A046693 Size of smallest subset S of N={0,1,2,...,n} such that S-S=N, where S-S={abs(i-j) | i,j in S}.
 * @author Sean A. Irvine
 */
public class A046693 implements Sequence {

  // This is a genuine search and will only be good for a few terms.
  // Formulas are known that work for the initial terms of this sequence.

  private int mN = -1;
  private int mPrev = 1;

  private boolean isComplete(final Z s, final Z n) {
    Z r = Z.ZERO;
    Z t = s;
    int k = 0;
    while (!t.isZero()) {
      final Z u = t.makeOdd();
      final int delta = (int) t.auxiliary();
      k += delta;
      r = r.or(s.shiftRight(k));
      ++k;
      t = u.divide2();
    }
    return r.equals(n);
  }

  @Override
  public Z next() {
    // We use bitsets to keep track of members of S, using "swizzle" to step from
    // one set to the next.  We stop when we find a solution.
    final Z limit = Z.ONE.shiftLeft(++mN + 1);
    final Z target = limit.subtract(1);
    Z start = Z.ONE.shiftLeft(mPrev).subtract(1);
    while (true) {
      for (Z s = start; s.compareTo(limit) < 0; s = ZUtils.swizzle(s)) {
        if (isComplete(s, target)) {
          return Z.valueOf(mPrev);
        }
      }
      // No solution with mPrev integers, increase and try again
      ++mPrev;
      start = start.multiply2().or(Z.ONE);
    }
  }
}
