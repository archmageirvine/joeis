package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005277;

/**
 * A072033.
 * @author Sean A. Irvine
 */
public class A072077 extends Sequence1 {

  private final Sequence mSeq = new A005277();
  private Z mA = Z.ONE;
  private long mCount = 0;
  private Z mT = mSeq.next();

  @Override
  public Z next() {
    mA = mA.multiply2();
    while (mT.compareTo(mA) <= 0) {
      ++mCount;
      mT = mSeq.next();
    }
    return Z.valueOf(mCount);
  }
}
