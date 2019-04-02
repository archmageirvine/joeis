package irvine.oeis.a007;

import irvine.math.z.InfinitaryDivisors;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007358 Infinitary multi-perfect numbers.
 * @author Sean A. Irvine
 */
public class A007358 implements Sequence {

  private Z mN = Z.valueOf(-6);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(6);
      if (Z.ZERO.equals(mN)) {
        return Z.ONE;
      }
      if (Z.ZERO.equals(InfinitaryDivisors.infinitaryDivisorSum(mN).mod(mN))) {
        return mN;
      }
    }
  }
}
