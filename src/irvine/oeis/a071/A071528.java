package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071528 Number of 1's among the elements of the simple continued fraction for e(n)=sum(k=1,n,1/k!).
 * @author Sean A. Irvine
 */
public class A071528 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mSum = mSum.add(new Q(Z.ONE, mF));
    long cnt = 0;
    for (final Z t : ContinuedFractionUtils.continuedFraction(mSum)) {
      if (Z.ONE.equals(t)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
