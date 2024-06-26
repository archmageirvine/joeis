package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054038 Numbers k such that k^2 contains every digit at least once.
 * @author Sean A. Irvine
 */
public class A054038 extends Sequence1 {

  private Z mN = Z.valueOf(32042);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(Functions.SYNDROME.i(mN.square())) == 10) {
        return mN;
      }
    }
  }
}

