package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002182;

/**
 * A073771 Highly composite numbers k such that 2*k is not a highly composite number.
 * @author Sean A. Irvine
 */
public class A073771 extends Sequence1 {

  private final Sequence mASeq = new A002182();
  private final Sequence mBSeq = new A002182();
  private Z mB = mBSeq.next();

  @Override
  public Z next() {
    while (true) {
      final Z a = mASeq.next();
      final Z a2 = a.multiply2();
      while (mB.compareTo(a2) < 0) {
        mB = mBSeq.next();
      }
      if (!a2.equals(mB)) {
        return a;
      }
    }
  }
}
