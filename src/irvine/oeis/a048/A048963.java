package irvine.oeis.a048;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a036.A036275;

/**
 * A048963 Table in which n-th row lists digits in periodic part of decimal expansion of reciprocal of n-th prime.
 * @author Sean A. Irvine
 */
public class A048963 extends A036275 {

  private final Fast mPrime = new Fast();
  private int[] mA = new int[0];
  private int mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mM >= mA.length) {
      do {
        mA = super.step();
      } while (!mPrime.isPrime(++mN));
      mM = 0;
    }
    return Z.valueOf(mA[mM]);
  }
}
