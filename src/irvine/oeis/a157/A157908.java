package irvine.oeis.a157;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A157908 Nonprimes whose digits are all square.
 * @author Georg Fischer
 */
public class A157908 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        if (String.valueOf(mN).matches("[0149]+")) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
