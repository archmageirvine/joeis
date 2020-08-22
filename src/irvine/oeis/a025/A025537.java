package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002944;
import irvine.oeis.a003.A003418;

/**
 * A025537 a(n) = (1/s(1) + 1/s(2) + ... + 1/s(n+1)) * LCM{1, 2, ..., n}, where s(k) = LCM{1,2,...,k}/k = A002944(k).
 * @author Sean A. Irvine
 */
public class A025537 extends A002944 {

  private Sequence mA = new A003418();
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return mSum.multiply(mA.next()).toZ();
  }
}
