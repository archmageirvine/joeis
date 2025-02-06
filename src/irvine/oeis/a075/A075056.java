package irvine.oeis.a075;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A075056 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    Z t = mA.sqrt();
    while (true) {
      t = t.add(1);
      final Z s = t.square();
      if (Predicates.PALINDROME.is(s.subtract(mA))) {
        mA = s;
        return s;
      }
    }
  }
}
