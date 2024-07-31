package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071532.
 * @author Sean A. Irvine
 */
public class A071639 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long pop = Long.bitCount(++mN);
      if (Functions.CORE.l(mN) == pop * (Functions.DIGIT_LENGTH.l(2, mN) - pop)) {
        return Z.valueOf(mN);
      }
    }
  }
}
