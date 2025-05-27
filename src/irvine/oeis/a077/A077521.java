package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077521 a(1) = 1, a(n) = smallest squarefree number which begins with n and is a multiple of the previous term.
 * @author Sean A. Irvine
 */
public class A077521 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final String s = String.valueOf(mN);
      final Z t = mA;
      while (!Predicates.SQUARE_FREE.is(mA) || !mA.toString().startsWith(s)) {
        mA = mA.add(t);
      }
    }
    return mA;
  }
}
