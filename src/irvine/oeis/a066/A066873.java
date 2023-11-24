package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002025;

/**
 * A066873 Number of amicable pairs where smaller term of the pair is less than 10^n.
 * @author Sean A. Irvine
 */
public class A066873 extends Sequence1 {

  private final Sequence mSeq = new A002025();
  private Z mA = mSeq.next();
  private Z mT = Z.ONE;
  private long mCount = 0;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    while (mA.compareTo(mT) < 0) {
      ++mCount;
      mA = mSeq.next();
    }
    return Z.valueOf(mCount);
  }
}
