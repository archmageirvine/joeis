package irvine.oeis.a069;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069692 Smallest triangular number with value of the internal digits = n; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A069692 extends Sequence0 {

  private static final int HEURISTIC = 100;
  private long mN = -1;
  private long mA = 10;

  @Override
  public Z next() {
    if (++mN >= mA) {
      mA *= 10;
    }
    Z v = Z.valueOf(mA);
    for (int k = 0; k < HEURISTIC; ++k, v = v.multiply(10)) {
      for (long a = 1; a <= 9; ++a) {
        final Z t = v.multiply(a).add(mN).multiply(10);
        for (long b = 0; b <= 9; ++b) {
          final Z u = t.add(b);
          if (Predicates.TRIANGULAR.is(u)) {
            return u;
          }
        }
      }
    }
    return Z.ZERO;
  }
}
