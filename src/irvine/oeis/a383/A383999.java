package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003849;

/**
 * A383999 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A383999 extends Sequence1 {

  private final Sequence mSeq = new A003849();
  private int mA = mSeq.next().intValue();
  private int mB = mSeq.next().intValue();

  @Override
  public Z next() {
    final int t = mA << 2;
    mA = mB;
    mB = mSeq.next().intValue();
    switch (t + (mA << 1) + mB) {
      case 1:
        return Z.ZERO;
      case 2:
        return Z.ONE;
      case 4:
        return Z.TWO;
      case 5:
        return Z.THREE;
      default:
        throw new RuntimeException("Unexpected triple from A003849");
    }
  }
}
