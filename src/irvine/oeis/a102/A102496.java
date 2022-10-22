package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A102496 Values of n for which the concatenation of the form 1nn1 (sequence A100846) are primes.
 * @author Georg Fischer
 */
public class A102496 extends AbstractSequence {

  private int mN;
  private final String mDigit;

  /** Construct the sequence. */
  public A102496() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset sequence offset
   * @param digit the digit
   */
  public A102496(final int offset, final int digit) {
    super(offset);
    mN = -1;
    mDigit = String.valueOf(digit);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final String nz = Z.valueOf(mN).toString();
      final Z cand = new Z(mDigit + nz + nz + mDigit);
      if (cand.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
