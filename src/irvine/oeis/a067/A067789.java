package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002162;

/**
 * A067789 Numbers k whose last digit is the k-th digit of log(2).
 * @author Sean A. Irvine
 */
public class A067789 extends Sequence1 {

  private long mN = 0;
  private final Sequence mLog2 = new A002162();

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 == mLog2.next().longValue()) {
        return Z.valueOf(mN);
      }
    }
  }
}
