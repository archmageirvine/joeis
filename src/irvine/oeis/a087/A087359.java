package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087359 For n &gt; 2, a(n) is the smallest triangular number &gt; a(n-1) and congruent to a(n-1) (mod a(n-2)).
 * @author Sean A. Irvine
 */
public class A087359 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.THREE;
      return mB;
    }
    Z t = mB;
    do {
      t = t.add(mA);
    } while (!Predicates.TRIANGULAR.is(t));
    mA = mB;
    mB = t;
    return t;
  }
}
