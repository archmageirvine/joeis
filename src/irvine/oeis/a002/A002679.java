package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002679 Denominator of <code>2*Stirling_2(n,2)/n!</code>.
 * @author Sean A. Irvine
 */
public class A002679 implements Sequence {

  private Z mA = Z.TWO;
  private Z mB = Z.TWO;
  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    mA = mA.shiftLeft(1);
    mB = mB.multiply(mN);
    return new Q(mA.subtract(2), mB).multiply(mN).den();
  }
}
