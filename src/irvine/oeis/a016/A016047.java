package irvine.oeis.a016;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A016047 Smallest prime factor of Mersenne numbers.
 * @author Sean A. Irvine
 */
public class A016047 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A016047(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A016047() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  protected long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Functions.LPF.z(Z.ONE.shiftLeft(mP).subtract(1));
  }
}
