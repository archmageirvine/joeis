package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072303 Numbers n for which n is congruent to n^2 mod phi(n).
 * @author Sean A. Irvine
 */
public class A072303 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().subtract(mN).mod(Functions.PHI.z(mN)).isZero()) {
        return mN;
      }
    }
  }
}

