package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077210 a(1) = 2, a(n+1) is the smallest squarefree number greater than n*a(n).
 * @author Sean A. Irvine
 */
public class A077210 extends Sequence1 {

  private long mN = -1;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN);
      do {
        mA = mA.add(1);
      } while (!Predicates.SQUARE_FREE.is(mA));
    }
    return mA;
  }
}

