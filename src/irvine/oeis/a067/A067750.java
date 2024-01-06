package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A067750 Numbers k whose last digit is the k-th digit of Pi.
 * @author Sean A. Irvine
 */
public class A067750 extends Sequence1 {

  private long mN = -1;
  private final Sequence mPi = new A000796();

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 == mPi.next().longValue()) {
        return Z.valueOf(mN);
      }
    }
  }
}
