package irvine.oeis.a047;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047791 Numbers n such that n plus digit sum of n (A007953) equals a prime.
 * @author Sean A. Irvine
 */
public class A047791 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.add(Functions.DIGIT_SUM.l(mN)).isProbablePrime()) {
        return mN;
      }
    }
  }
}
