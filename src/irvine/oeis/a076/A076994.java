package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076994 a(1) = 2, a(n+1) is the largest squarefree number &lt; 2*a(n).
 * @author Sean A. Irvine
 */
public class A076994 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      mA = mA.multiply2();
      do {
        mA = mA.subtract(1);
      } while (!Predicates.SQUARE_FREE.is(mA));
    }
    return mA;
  }
}

