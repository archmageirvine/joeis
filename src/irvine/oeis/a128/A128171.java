package irvine.oeis.a128;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A128171 Numbers k such that k divides 1 + Sum_{j=1..k} prime(j)^7.
 * @author Sean A. Irvine
 */
public class A128171 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mPrev = Z.ONE;
  private Z mSum = start();
  private long mN = 0;

  protected Z start() {
    return Z.ONE;
  }

  protected int power() {
    return 7;
  }

  @Override
  public Z next() {
    while (true) {
      mPrev = mPrime.nextPrime(mPrev);
      mSum = mSum.add(mPrev.pow(power()));
      if (mSum.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
