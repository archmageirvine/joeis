package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a008.A008784;

/**
 * A076948 Smallest k such that nk-1 is a square, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A076948 extends A008784 {

  private long mNextNonzero = super.next().longValueExact();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mNextNonzero) {
      mNextNonzero = super.next().longValueExact();
      long k = 0;
      final Z n = Z.valueOf(mN);
      while (true) {
        if (Predicates.SQUARE.is(n.multiply(++k).subtract(1))) {
          return Z.valueOf(k);
        }
      }
    }
    return Z.ZERO;
  }
}

