package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078372 Number of squarefree integers in {n, f(n), f(f(n)), ...., 1}, where f is the Collatz function defined by f(x) = x/2 if x is even; f(x) = 3x + 1 if x is odd.
 * @author Sean A. Irvine
 */
public class A078372 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 1;
    Z t = Z.valueOf(++mN);
    while (!t.isOne()) {
      if (Predicates.SQUARE_FREE.is(t)) {
        ++cnt;
      }
      t = Functions.COLLATZ.z(t);
    }
    return Z.valueOf(cnt);
  }
}

