package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072521 a(1) = 6 and then the smallest triangular numbers such that sum of two neighbors is also a triangular number.
 * @author Sean A. Irvine
 */
public class A072521 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SIX;
    } else {
      long v = Functions.TRINV.l(mA);
      while (true) {
        final Z t = Functions.TRIANGULAR.z(++v);
        final Z s = mA.add(t);
        if (Predicates.TRIANGULAR.is(s)) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
