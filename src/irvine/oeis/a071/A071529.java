package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071529 Number of 1's among the elements of the simple continued fraction for (1+1/n)^n.
 * @author Sean A. Irvine
 */
public class A071529 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (final Z t : ContinuedFractionUtils.continuedFraction(new Q(mN + 1, mN).pow(mN))) {
      if (Z.ONE.equals(t)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
