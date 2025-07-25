package irvine.oeis.a329;
// manually 2025-07-21

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A329760 Primes without {2, 7} as digits.
 * @author Georg Fischer
 */
public class A329760 extends AbstractSequence {

  private char mDigit1;
  private char mDigit2;
  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A329760() {
    this(1, 2, 7);
  }

  /**
   * Generic constructor with parameters.
   * @parm offset first index
   * @parm digit1 first digit
   * @parm digit2 second digit
   */
  public A329760(final int offset, final int digit1, final int digit2) {
    super(offset);
    mDigit1 = Character.forDigit(digit1, 10);
    mDigit2 = Character.forDigit(digit2, 10);
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final String sP = mP.toString();
      if (sP.indexOf(mDigit1) < 0 && sP.indexOf(mDigit2) < 0) {
        return mP;
      }
    }
  }
}
