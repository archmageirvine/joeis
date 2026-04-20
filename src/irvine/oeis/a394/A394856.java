package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000110;

/**
 * A394856 a(n) is the largest integer k such that the k-th Bell number does not exceed 2^(n+k).
 * @author Sean A. Irvine
 */
public class A394856 extends Sequence1 {

  private final Sequence mBell = new A000110();
  private Z mB = mBell.next();
  private long mK = 0;
  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply2();
    while (mB.compareTo(mT) <= 0) {
      mB = mBell.next();
      mT = mT.multiply2();
      ++mK;
    }
    return Z.valueOf(mK - 1);
  }
}
