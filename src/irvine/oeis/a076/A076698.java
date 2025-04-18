package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076698 a(1) = 2, a(n+1) = smallest squarefree number == 1 (mod a(n)) and  &gt; a(n).
 * @author Sean A. Irvine
 */
public class A076698 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    Z t = mA.add(1);
    while (!Predicates.SQUARE_FREE.is(t)) {
      t = t.add(mA);
    }
    mA = t;
    return mA;
  }
}
