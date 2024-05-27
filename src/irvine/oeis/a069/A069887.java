package irvine.oeis.a069;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069887 Number of terms in the simple continued fraction expansion for (1+1/n)^n.
 * @author Sean A. Irvine
 */
public class A069887 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(ContinuedFractionUtils.continuedFraction(Q.ONE.add(new Q(1, ++mN)).pow(mN)).size());
  }
}
