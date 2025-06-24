package irvine.oeis.a078;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078226 a(1) = 1, a(n+1) is the smallest odd multiple of a(n) (other than a(n) itself) in which the digits are alternately even and odd.
 * @author Sean A. Irvine
 */
public class A078226 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z t = mA.multiply2();
      do {
        mA = mA.add(t);
      } while (!Predicates.DIGIT_ALTERNATING_PARITY.is(mA));
    }
    return mA;
  }
}

