package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076734 Smallest squarefree number greater than or equal to n having the same number of prime factors as n (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A076734 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    final long omega = Functions.BIG_OMEGA.l(mN);
    while (!Predicates.SQUARE_FREE.is(k) || Functions.BIG_OMEGA.l(k) != omega) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
