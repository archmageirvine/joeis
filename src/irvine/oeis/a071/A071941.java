package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071941 Nonprimes for which floor(2^n/n) is even.
 * @author Georg Fischer
 */
public class A071941 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        if (Z.ONE.shiftLeft(mN).divide(mN).isEven()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
