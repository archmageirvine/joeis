package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060316.
 * @author Sean A. Irvine
 */
public class A071112 extends Sequence1 {

  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (ContinuedFractionUtils.continuedFraction(Q.ONE.add(new Q(1, mM)).pow(mM)).size() < mN) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
