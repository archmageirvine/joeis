package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007885 Numbers n such that balanced sequences exist with n distinct elements.
 * @author Sean A. Irvine
 */
public class A007885 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < 6) {
      return Z.valueOf(mN);
    }
    while (true) {
      mN = mPrime.nextPrime(mN);
      final IntegersModMul z = new IntegersModMul(mN);
      final Z nm1 = Z.valueOf(mN - 1);
      if (z.order(Z.TWO).equals(nm1) || z.order(Z.valueOf(mN - 2)).equals(nm1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
