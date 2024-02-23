package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004539;

/**
 * A051043.
 * @author Sean A. Irvine
 */
public class A068541 extends Sequence1 {

  private final Sequence mSeq = new A004539().skip();
  private long mN = 0;
  private long mSum = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSum += mSeq.next().longValue();
      if (2 * mSum == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
