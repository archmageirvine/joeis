package irvine.oeis.a389;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389950 Sum of cubefree numbers &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A389950 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mN = null;
  private Z mSum = Z.ZERO;

  // inclusion-exclusion
  private void count(final Z cube, final Z p, final long sign) {
    final Z v = mN.divide(cube);
    final Z contrib = cube.multiply(v).multiply(v.add(1)).divide2().multiply(sign);
    mSum = mSum.add(contrib);
    Z q = p;
    while (true) {
      q = mPrime.nextPrime(q);
      final Z nc = cube.multiply(q.pow(3));
      if (nc.compareTo(mN) > 0) {
        break;
      }
      count(nc, q, -sign);
    }
  }

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
      return Z.ONE;
    }
    mN = mN.multiply(10);
    mSum = Z.ZERO;
    count(Z.ONE, Z.ONE, 1);
    return mSum;
  }
}
