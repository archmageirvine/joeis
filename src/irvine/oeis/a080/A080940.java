package irvine.oeis.a080;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A080940 Smallest proper divisor of n which is a suffix of n in binary representation; a(n) = 0 if no such divisor exists.
 * @author Sean A. Irvine
 */
public class A080940 extends Sequence1 implements DirectSequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    if (Predicates.POWER_OF_TWO.is(n)) {
      return Z.ZERO;
    }
    n.makeOdd();
    return Z.ONE.shiftLeft(n.auxiliary());
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
