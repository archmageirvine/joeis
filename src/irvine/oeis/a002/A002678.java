package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.q.Q;

/**
 * A002678.
 * @author Sean A. Irvine
 */
public class A002678 implements Sequence {

  private Z mA = Z.TWO;
  private Z mB = Z.TWO;
  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    mA = mA.shiftLeft(1);
    mB = mB.multiply(mN);
    return new Q(mA.subtract(2), mB).num();
  }
}
