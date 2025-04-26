package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077001 a(1) = 1, a(n+1) is the largest squarefree number &lt;= n*a(n).
 * @author Sean A. Irvine
 */
public class A077001 extends Sequence1 {

  private long mN = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      mA = mA.multiply(++mN);
      while (!Predicates.SQUARE_FREE.is(mA)) {
        mA = mA.subtract(1);
      }
    }
    return mA;
  }
}

