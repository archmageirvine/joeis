package irvine.oeis.a087;

import irvine.factor.util.FactorUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A087318 Smallest number of the form n^k + 1 with the prime signature of n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A087318 extends Sequence1 implements Conjectural {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || Predicates.POWER.is(mN)) {
      return Z.ZERO;
    }
    final Z sig = FactorUtils.leastPrimeSignature(mN);
    if (Z.TWO.equals(sig)) {
      return Z.TWO;
    }
    Z t = Z.ONE;
    while (true) {
      t = t.multiply(mN);
      final Z u = t.add(1);
      try {
        if (FactorUtils.leastPrimeSignature(u).equals(sig)) {
          return u;
        }
      } catch (final UnsupportedOperationException e) {
        // Heuristic -- available factorizations do not exhibit a solution
        return Z.ZERO;
      }
    }
  }
}
