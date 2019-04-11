package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007509 Numerator of Sum_{k=0..n} <code>(-1)^k/(2*k+1)</code>.
 * @author Sean A. Irvine
 */
public class A007509 implements Sequence {

  private long mN = -1;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.signedAdd((++mN & 1) == 0, new Q(1, 2 * mN + 1));
    return mSum.num();
  }
}
