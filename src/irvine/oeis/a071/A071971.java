package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071971.
 * @author Sean A. Irvine
 */
public class A071971 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    final Z n3 = Z.valueOf(++mN).pow(3);
    while (true) {
      final Q t = mSum.add(new Q(1, mM));
      if (Functions.SUM.z(ContinuedFractionUtils.continuedFraction(t)).equals(n3)) {
        mSum = t;
        return Z.valueOf(mM);
      }
      ++mM;
    }
  }
}
