package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002193;

/**
 * A067757 Numbers k whose last digit is the k-th digit of sqrt(2).
 * @author Sean A. Irvine
 */
public class A067757 extends Sequence1 {

  private long mN = -1;
  private final Sequence mSqrt2 = new A002193();

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 == mSqrt2.next().longValue()) {
        return Z.valueOf(mN);
      }
    }
  }
}
