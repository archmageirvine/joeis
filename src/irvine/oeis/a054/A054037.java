package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054037 Numbers k such that k^2 contains exactly 9 different digits.
 * @author Sean A. Irvine
 */
public class A054037 extends Sequence1 {

  private Z mN = Z.valueOf(10123);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(Functions.SYNDROME.i(mN.square())) == 9) {
        return mN;
      }
    }
  }
}

