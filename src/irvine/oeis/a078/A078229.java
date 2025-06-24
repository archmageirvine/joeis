package irvine.oeis.a078;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078229 a(n) = A078226(n+1)/A078226(n).
 * @author Sean A. Irvine
 */
public class A078229 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z prev = mA;
    final Z t = mA.multiply2();
    do {
      mA = mA.add(t);
    } while (!Predicates.DIGIT_ALTERNATING_PARITY.is(mA));
    return mA.divide(prev);
  }
}

