package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067578 a(n) = Product_{i=1..n} phi(i) * Sum_{i=1..n} 1/phi(i) where phi is the Euler totient function A000010(n).
 * @author Sean A. Irvine
 */
public class A067578 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Z mProd = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    final long n = ++mN;
    final Z phi = Functions.PHI.z(n);
    mSum = mSum.add(new Q(Z.ONE, phi));
    mProd = mProd.multiply(phi);
    return mSum.multiply(mProd).toZ();
  }
}
