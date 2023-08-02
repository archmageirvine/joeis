package irvine.oeis.a057;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A057964 Triangle T(n,k) of number of minimal 3-covers of a labeled n-set that cover k points of that set uniquely (k=3,..,n).
 * @author Sean A. Irvine
 */
public class A057964 extends Sequence3 {

  private int mN = 2;
  private int mM = 2;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 3;
    }
    return Binomial.binomial(mN, mM).multiply(Stirling.secondKind(mM, 3)).shiftLeft(2L * (mN - mM));
  }
}
