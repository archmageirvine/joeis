package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A087319 Smallest number of the form n^k + 1, with tau(a(n)) = tau(n), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A087319 extends Sequence1 implements Conjectural {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || Predicates.SQUARE.is(mN)) {
      return Z.ZERO;
    }
    Z t = Z.ONE;
    final Z d = Functions.SIGMA0.z(mN);
    if (Z.TWO.equals(d)) {
      return Z.TWO;
    }
    while (true) {
      t = t.multiply(mN);
      final Z u = t.add(1);
      try {
        if (Functions.SIGMA0.z(u).equals(d)) {
          return u;
        }
      } catch (final UnsupportedOperationException e) {
        // Heuristic -- available factorizations do not exhibit a solution
        return Z.ZERO;
      }
    }
  }
}
