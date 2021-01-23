package irvine.oeis.a128;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A128171 Numbers n such that n divides 1 + Sum[ Prime[k]^7, {k,1,n} ].
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
