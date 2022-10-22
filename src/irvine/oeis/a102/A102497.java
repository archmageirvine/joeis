package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A102497 Primes of the concatenated form 1nn1 where n is an integer &gt;=0.
 * @author Georg Fischer
 */
public class A102497 extends AbstractSequence {

  private int mN;
  private final String mDigit;

  /** Construct the sequence. */
  public A102497() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset the offset
   * @param digit the digit
   */
  public A102497(final int offset, final int digit) {
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
        return cand;
      }
    }
  }
}
