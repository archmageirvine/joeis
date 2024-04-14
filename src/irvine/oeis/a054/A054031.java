package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054031 Numbers whose square contains exactly 3 distinct digits.
 * @author Sean A. Irvine
 */
public class A054031 extends Sequence1 {

  private Z mN = Z.valueOf(12);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(Functions.SYNDROME.i(mN.square())) == 3) {
        return mN;
      }
    }
  }
}

