package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A071563.
 * @author Sean A. Irvine
 */
public class A071563 extends Sequence0 {

  private final Sequence mA = new A071562();
  private Z mK = null;
  private Z mT = mA.next();
  private long mConsec = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mN > mConsec) {
      mK = mT;
      mT = mA.next();
      mConsec = mT.subtract(mK).longValueExact() - 1;
    }
    return mK.add(1);
  }
}
