package irvine.oeis.a232;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000073;

/**
 * A232570 Numbers k that divide tribonacci(k) (A000073(k)).
 * @author Georg Fischer
 */
public class A232570 extends Sequence1 {

  private Z mK = Z.ZERO;
  private final A000073 mSeq = new A000073();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (mSeq.next().mod(mK).isZero()) {
        return mK;
      }
    }
  }
}
