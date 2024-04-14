package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061277 Numbers which have more different digits than their squares.
 * @author Sean A. Irvine
 */
public class A061277 extends Sequence1 {

  private Z mN = Z.valueOf(108);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(Functions.SYNDROME.i(mN)) > Integer.bitCount(Functions.SYNDROME.i(mN.square()))) {
        return mN;
      }
    }
  }
}
