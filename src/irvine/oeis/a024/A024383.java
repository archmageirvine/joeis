package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024383.
 * @author Sean A. Irvine
 */
public class A024383 implements Sequence {

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
