package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071205 Largest digit of A071204(n).
 * @author Sean A. Irvine
 */
public class A071205 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long largestDigit = Functions.DIGIT_SORT_ASCENDING.l(++mN) % 10;
      if (mN % largestDigit == 0) {
        return Z.valueOf(largestDigit);
      }
    }
  }
}
