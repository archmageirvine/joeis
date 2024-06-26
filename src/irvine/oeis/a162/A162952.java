package irvine.oeis.a162;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A162952 A positive integer n is included if n and the number of divisors of n contain the same number of 1's in their binary representations.
 * @author Sean A. Irvine
 */
public class A162952 extends Sequence1 {

  private long mN = 0;
  protected Z mD;

  @Override
  public Z next() {
    while (true) {
      mD = Functions.SIGMA0.z(++mN);
      if (mD.bitCount() == (long) Long.bitCount(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
