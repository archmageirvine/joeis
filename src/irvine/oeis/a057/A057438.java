package irvine.oeis.a057;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057438 a(1) = 1; a(n+1) = product_{k = 1 to n} [a(k)] *sum_{j = 1 to n} [1/a(j)].
 * @author Sean A. Irvine
 */
public class A057438 extends Sequence1 {

  private Z mProd = Z.ZERO;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    if (mProd.isZero()) {
      mProd = Z.ONE;
      return Z.ONE;
    } else if (Q.ZERO.equals(mSum)) {
      mSum = Q.ONE;
    } else {
      final Z t = mSum.multiply(mProd).toZ();
      mSum = mSum.add(new Q(Z.ONE, t));
      mProd = mProd.multiply(t);
    }
    return mSum.multiply(mProd).toZ();
  }
}
