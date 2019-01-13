package irvine.oeis.a216;

import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A216453.
 * @author Sean A. Irvine
 */
public class A216453 implements Sequence {

  private long mN = 0;
  private Z mPhi = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mPhi = mPhi.add(LongUtils.phi(mN));
    return Binomial.binomial(mN + 1, 2).subtract(mPhi).multiply(6);
  }
}
