package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A082057 Least x=a(n) such that product of common prime-divisors [without multiplicity] of sigma(x) and phi(x) equals n; or 0 if n is not a squarefree number or if no such x exists. Among indices n only squarefree numbers arise because multiplicity of prime factors is ignored.
 * @author Sean A. Irvine
 */
public class A082057 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (!Predicates.SQUARE_FREE.is(++mN)) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      final long v = Functions.SQUARE_FREE_KERNEL.l(Functions.GCD.l(Functions.PHI.l(++mM), Functions.SIGMA.z(mM)));
      if (mFirsts.get(v) == 0) {
        mFirsts.set(v, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
