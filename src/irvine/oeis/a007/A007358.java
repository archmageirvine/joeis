package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007358 Infinitary multi-perfect numbers.
 * @author Sean A. Irvine
 */
public class A007358 extends Sequence1 {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(6);
      if (mN.isZero()) {
        return Z.ONE;
      }
      if (Functions.INFINITARY_SIGMA1.z(mN).mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
