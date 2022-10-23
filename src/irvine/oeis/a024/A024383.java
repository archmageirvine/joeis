package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024383 a(n) = s(1)*s(2)*...*s(n)*(1/s(1) - 1/s(2) + ... + c/s(n)), where c = (-1)^(n+1) and s(k) = 4k-3 for k = 1,2,3,...
 * @author Sean A. Irvine
 */
public class A024383 extends Sequence1 {

  private long mN = -3;
  private Z mA = Z.ONE;
  private Q mB = Q.ZERO;

  @Override
  public Z next() {
    mN += 4;
    mA = mA.multiply(mN);
    mB = mB.signedAdd((mN & 4) == 0, new Q(1, mN));
    return mB.multiply(mA).toZ();
  }
}
