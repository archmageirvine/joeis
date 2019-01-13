package irvine.oeis.a007;

import irvine.math.z.InfinitaryDivisors;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007357.
 * @author Sean A. Irvine
 */
public class A007357 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(6);
      if (InfinitaryDivisors.infinitaryDivisorSum(mN).equals(mN)) {
        return mN;
      }
    }
  }
}
