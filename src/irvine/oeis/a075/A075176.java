package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075176 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z res = Z.ONE;
    long p = 1;
    final int len = Functions.DIGIT_LENGTH.i(2, mN);
    int k = 0;
    while (true) {
      p = mPrime.nextPrime(p);
      int pos = Functions.TRIANGULAR.i(k);
      if (pos > len) {
        break;
      }
      int i = ++k;
      while (pos <= len) {
        if (mN.testBit(pos)) {
          if (i > k && !mN.testBit(pos - i)) {
            return Z.ZERO;
          }
          res = res.multiply(p);
        }
        pos += ++i;
      }
    }
    return res;
  }
}
