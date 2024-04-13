package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001101 Moran numbers: k such that k/(sum of digits of k) is prime.
 * @author Sean A. Irvine
 */
public class A001101 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long ds = Functions.DIGIT_SUM.l(mN);
      if (mN.mod(ds) == 0 && mN.divide(ds).isPrime()) {
        return mN;
      }
    }
  }
}

