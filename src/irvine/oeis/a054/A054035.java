package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054035 Numbers n such that n^2 contains exactly 7 different digits.
 * @author Sean A. Irvine
 */
public class A054035 extends Sequence1 {

  private Z mN = Z.valueOf(1016);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(Functions.SYNDROME.i(mN.square())) == 7) {
        return mN;
      }
    }
  }
}

