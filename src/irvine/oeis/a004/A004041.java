package irvine.oeis.a004;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004041 Scaled sums of odd reciprocals: a(n) = (2*n + 1)!!*(Sum_{k=0..n} 1/(2*k + 1)).
 * @author Sean A. Irvine
 */
public class A004041 extends Sequence0 {

  private long mN = -1;
  private Q mSum = Q.ZERO;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    mProd = mProd.multiply(mN);
    mSum = mSum.add(new Q(1, mN));
    return mSum.multiply(mProd).toZ();
  }
}
