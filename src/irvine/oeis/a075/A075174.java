package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075174 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z res = Z.ONE;
    long p = 1;
    final int len = Functions.DIGIT_LENGTH.i(2, mN);
    for (int start = 1; start <= len; start *= 2) {
      p = mPrime.nextPrime(p);
      final int step = start * 2;
      int pos = start - 1;
      while (pos <= len) {
        if (mN.testBit(pos)) {
          if (pos > start && !mN.testBit(pos - step)) {
            return Z.ZERO;
          }
          res = res.multiply(p);
        }
        pos += step;
      }
    }
    return res;
  }
}
