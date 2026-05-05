package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084702 a(n) is the smallest k such that k + 1 and n*k + 1 both are perfect squares, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A084702 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.FOUR.equals(mN) || (!mN.isOne() && mN.isOdd() && Predicates.SQUARE.is(mN))) {
      return Z.ZERO;
    }
    long r = 1;
    while (true) {
      final long k = ++r * r - 1;
      if (Predicates.SQUARE.is(mN.multiply(k).add(1))) {
        return Z.valueOf(k);
      }
    }
  }
}
