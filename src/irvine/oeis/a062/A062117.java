package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062117 Order of 3 mod n-th prime.
 * @author Sean A. Irvine
 */
public class A062117 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private final Z mOrder;

  /** Construct the sequence. */
  public A062117() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param order order of mod n-th prime
   */
  public A062117(final int order) {
    mOrder = Z.valueOf(order);
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (mOrder.mod(mP).isZero()) {
      return Z.ZERO;
    }
    return new IntegersModMul(mP).order(mOrder);
  }
}
