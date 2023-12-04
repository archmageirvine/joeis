package irvine.oeis.a265;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A265184 a(n) = Sum_{k = 0..n} (-1)^k*prime(k)#, where prime(k)# is the prime factorial function.
 * @author Georg Fischer
 */
public class A265184 extends AbstractSequence {

  private int mN = -1;
  private Z mP = Z.ONE;
  private Z mPrimor = Z.ONE;
  private Z mSum = Z.ZERO;
  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A265184() {
    super(0);
  }

  @Override
  public Z next() {
    // a(n) = Sum_{k = 0..n} A033999(k)*A002110(k).
    ++mN;
    mSum = mSum.add(((mN & 1) == 0) ? mPrimor : mPrimor.negate());
    mP = mPrime.nextPrime(mP);
    mPrimor = mPrimor.multiply(mP);
    return mSum;
  }
}
