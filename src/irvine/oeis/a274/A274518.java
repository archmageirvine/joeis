package irvine.oeis.a274;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000073;

/**
 * A274518 Numbers n such that n^2 divides A000073(n).
 * @author Georg Fischer
 */
public class A274518 extends Sequence1 {

  private Z mK = Z.ZERO;
  private final A000073 mSeq = new A000073();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      if (mSeq.next().mod(mK.multiply(mK)).isZero()) {
        return mK;
      }
    }
  }
}
