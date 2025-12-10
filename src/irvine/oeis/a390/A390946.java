package irvine.oeis.a390;

import java.util.Collections;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390946 Irregular triangle read by rows of continued fraction expansions of prime(i)/prime(j+1) for j &gt;= 1, 1 &lt;= i &lt; j.
 * @author Sean A. Irvine
 */
public class A390946 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mQ = 0;
  private int mM = 0;
  private List<Z> mRow = Collections.emptyList();

  @Override
  public Z next() {
    if (++mM >= mRow.size()) {
      mQ = mPrime.nextPrime(mQ);
      if (mQ == mP) {
        mP = mPrime.nextPrime(mP);
        mQ = 2;
      }
      mRow = ContinuedFractionUtils.continuedFraction(new Q(mQ, mP));
      mM = 1;
    }
    return mRow.get(mM);
  }
}
