package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066419 Numbers k such that k! is not divisible by the sum of the decimal digits of k!.
 * @author Sean A. Irvine
 */
public class A066419 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final long s = Functions.DIGIT_SUM.l(mF);
      if (mF.mod(s) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
