package irvine.oeis.a161;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A161578 a(1)=2. a(n) = the smallest integer &gt; a(n-1) such that d(a(n)) &lt;= d(n), where d(n) = the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A161578 extends Sequence1 {

  private long mN = 1;
  private Z mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.TWO;
    } else {
      final long dn = Functions.SIGMA0.l(++mN);
      do {
        mPrev = mPrev.add(1);
      } while (Functions.SIGMA0.l(mPrev) > dn);
    }
    return mPrev;
  }
}

