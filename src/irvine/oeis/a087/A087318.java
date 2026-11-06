package irvine.oeis.a087;

import irvine.factor.util.FactorUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A401531 allocated for Akash Suresh.
 * @author Sean A. Irvine
 */
public class A087318 extends Sequence1 implements Conjectural {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || Predicates.POWER.is(mN)) {
      return Z.ZERO;
    }
    Z t = Z.ONE;
    final Z sig = FactorUtils.leastPrimeSignature(mN);
    if (Z.TWO.equals(sig)) {
      return Z.TWO;
    }
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
