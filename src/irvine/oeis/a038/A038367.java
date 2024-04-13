package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A038367 Numbers n with property that (product of digits of n) is divisible by (sum of digits of n).
 * @author Sean A. Irvine
 */
public class A038367 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.digitProduct(mN).mod(Functions.DIGIT_SUM.l(mN)) == 0) {
        return mN;
      }
    }
  }
}
