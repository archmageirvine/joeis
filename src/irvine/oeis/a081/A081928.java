package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081928 Sum of the n smallest numbers having the sum of their digits equal to n.
 * @author Sean A. Irvine
 */
public class A081928 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long r = 0;
    Z s = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      while (Functions.DIGIT_SUM.l(++r) != mN) {
        // do nothing
      }
      s = s.add(r);
    }
    return s;
  }
}
