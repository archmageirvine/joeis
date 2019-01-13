package irvine.oeis.a007;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007996.
 * @author Sean A. Irvine
 */
public class A007996 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.compareTo(Z.THREE) <= 0) {
        return mP;
      }
      if (mP.mod(6) == 1) {
        Z x = Z.TWO;
        final HashSet<Z> s = new HashSet<>();
        while (s.add(x)) {
          if (Z.ZERO.equals(x)) {
            return mP;
          }
          x = x.square().subtract(x).add(1).mod(mP);
        }
      }
    }
  }
}
