package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A001223 Prime gaps: differences between consecutive primes.
 * @author Sean A. Irvine
 */
public class A001223 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001223(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001223() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    final Z p = mP;
    mP = mPrime.nextPrime(mP);
    return mP.subtract(p);
  }

  @Override
  public Z a(final Z n) {
    return Functions.PRIME.z(n.add(1)).subtract(Functions.PRIME.z(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.PRIME.z(n + 1).subtract(Functions.PRIME.z(n));
  }
}

