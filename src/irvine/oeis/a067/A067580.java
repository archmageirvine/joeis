package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A067580 a(n) = Product_{i=2..n} A001222(i) * Sum_{i=2..n} 1/A001222(i).
 * @author Sean A. Irvine
 */
public class A067580 extends Sequence2 {

  private Q mSum = Q.ZERO;
  private Z mProd = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    final long omega = Functions.BIG_OMEGA.l(++mN);
    mSum = mSum.add(new Q(1, omega));
    mProd = mProd.multiply(omega);
    return mSum.multiply(mProd).toZ();
  }
}
