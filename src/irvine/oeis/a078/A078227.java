package irvine.oeis.a078;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078227 a(1) = 2, a(n+1) is the smallest multiple of a(n) such that the digits are alternately odd and even. The unit digit is always even and parity alternates.
 * @author Sean A. Irvine
 */
public class A078227 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      final Z t = mA;
      do {
        mA = mA.add(t);
      } while (!Predicates.DIGIT_ALTERNATING_PARITY.is(mA));
    }
    return mA;
  }
}

