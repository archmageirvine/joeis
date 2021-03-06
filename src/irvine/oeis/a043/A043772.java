package irvine.oeis.a043;

import irvine.math.z.Z;

/**
 * A043772 Numbers k such that all divisors of k are lucky numbers.
 * @author Sean A. Irvine
 */
public class A043772 extends A043754 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isLuckyDivisible(mN, 1)) {
        return mN;
      }
    }
  }
}

