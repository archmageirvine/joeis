package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034091 Records for sum of proper divisors function A001065.
 * @author Sean A. Irvine
 */
public class A034091 extends Sequence1 {

  private Z mMax = Z.valueOf(-2);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z sigmaProper = Functions.SIGMA1.z(++mN).subtract(mN);
      if (sigmaProper.compareTo(mMax) > 0) {
        mMax = sigmaProper;
        return mMax;
      }
    }
  }
}

