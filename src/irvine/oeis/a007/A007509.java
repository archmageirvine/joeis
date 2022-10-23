package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007509 Numerator of Sum_{k=0..n} (-1)^k/(2*k+1).
 * @author Sean A. Irvine
 */
public class A007509 extends Sequence0 {

  private long mN = -1;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.signedAdd((++mN & 1) == 0, new Q(1, 2 * mN + 1));
    return mSum.num();
  }
}
