package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071206 A071204(n) divided by its largest digit.
 * @author Sean A. Irvine
 */
public class A071206 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long largestDigit = Functions.DIGIT_SORT_ASCENDING.l(++mN) % 10;
      if (mN % largestDigit == 0) {
        return Z.valueOf(mN / largestDigit);
      }
    }
  }
}
