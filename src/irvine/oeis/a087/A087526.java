package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087526 a(0) = 1, a(n) = smallest squarefree number == 1 (mod a(n-1)) with n prime divisors.
 * @author Sean A. Irvine
 */
public class A087526 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      Z t = mA.add(1);
      while (!Predicates.SQUARE_FREE.is(t) || Functions.OMEGA.l(t) != mN) {
        t = t.add(mA);
      }
      mA = t;
    }
    return mA;
  }
}
