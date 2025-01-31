package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007357 Infinitary perfect numbers.
 * @author Sean A. Irvine
 */
public class A007357 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(6);
      if (Functions.INFINITARY_SIGMA1.z(mN).equals(mN)) {
        return mN;
      }
    }
  }
}
