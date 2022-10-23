package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058329 a(n) is smallest positive integer &gt; a(n-1) such that (sum{k=1 to n}[a(k)]) divides (product{k=1 to n}[a(k)])*(sum{k=1 to n}[1/a(k)]).
 * @author Sean A. Irvine
 */
public class A058329 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private Z mProd = Z.ONE;
  private Q mRecip = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z s = mSum.add(mN);
      final Z p = mProd.multiply(mN);
      final Q r = mRecip.add(new Q(1, mN));
      if (r.multiply(p).toZ().mod(s).isZero()) {
        mSum = s;
        mProd = p;
        mRecip = r;
        return Z.valueOf(mN);
      }
    }
  }
}
