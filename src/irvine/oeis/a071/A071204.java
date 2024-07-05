package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071204 Numbers which are multiples of their largest digit (decimal notation).
 * @author Sean A. Irvine
 */
public class A071204 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % (Functions.DIGIT_SORT_ASCENDING.l(mN) % 10) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
