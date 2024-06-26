package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038187 Numbers other than powers of 10 that are coprime to the sum of their digits.
 * @author Sean A. Irvine
 */
public class A038187 extends Sequence1 {

  private long mN = 10;
  private long mT = 100;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mT) {
        mT *= 10;
      } else {
        final long d = Functions.DIGIT_SUM.l(mN);
        if (Functions.GCD.l(mN, d) == 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
