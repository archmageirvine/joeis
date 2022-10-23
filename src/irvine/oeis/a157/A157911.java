package irvine.oeis.a157;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A157911 Nonprimes whose digits are all cubes.
 * @author Georg Fischer
 */
public class A157911 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        if (String.valueOf(mN).matches("[018]+")) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
