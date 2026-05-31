package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085084.
 * @author Sean A. Irvine
 */
public class A085087 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (Predicates.PRIME.is(mN)) {
      mA = mA.multiply(mN);
    } else {
      final Z[] qr = mA.divideAndRemainder(mN);
      if (qr[1].isZero()) {
        mA = qr[0];
      }
    }
    return mA;
  }
}

