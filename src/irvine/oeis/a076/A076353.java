package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076340.
 * @author Sean A. Irvine
 */
public class A076353 extends Sequence1 {

  private long mN = 0;
  private Q mSum = Q.ZERO;
  private Z mD = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      Q q = new Q(Functions.SQRT.l(++mN), mD);
      while (q.compareTo(Q.ONE) >= 0) {
        mD = mD.multiply(10);
        q = q.divide(10);
      }
      mSum = mSum.add(q);
      if (mSum.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
