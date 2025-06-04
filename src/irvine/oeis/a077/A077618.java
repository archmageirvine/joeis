package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A077618 Number of occurrences of n in A076734.
 * @author Sean A. Irvine
 */
public class A077618 extends Sequence1 implements DirectSequence {

  // After Antti Karttunen

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    if (n.equals(Z.ONE)) {
      return Z.ONE;
    }
    if (!Predicates.SQUARE_FREE.is(n)) {
      return Z.ZERO;
    }
    final long b = Functions.BIG_OMEGA.l(n);
    long s = 1;
    for (long k = n.longValueExact() - 1; k > 1; --k) {
      if (Functions.BIG_OMEGA.l(k) == b) {
        if (Predicates.SQUARE_FREE.is(k)) {
          return Z.valueOf(s);
        }
        ++s;
      }
    }
    return Z.valueOf(s);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
