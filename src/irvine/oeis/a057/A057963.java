package irvine.oeis.a057;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057963 Triangle T(n,k) of number of minimal 2-covers of a labeled n-set that cover k points of that set uniquely (k=2,..,n).
 * @author Sean A. Irvine
 */
public class A057963 implements Sequence {

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 2;
    }
    return Binomial.binomial(mN, mM).multiply(Z.ONE.shiftLeft(mM - 1).subtract(1));
  }
}
