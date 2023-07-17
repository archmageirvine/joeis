package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A001918 Least positive primitive root of n-th prime.
 * @author Sean A. Irvine
 */
public class A001918 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001918(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001918() {
    super(1);
  }

  protected final Fast mPrime = new Fast();
  protected Z mP = Z.ONE;

  /**
   * The prime for the most recent result
   * @return the prime
   */
  public Z getP() {
    return mP;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return ZUtils.leastPrimitiveRoot(mP);
  }
}
