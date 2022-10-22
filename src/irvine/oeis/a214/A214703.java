package irvine.oeis.a214;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A214703 Primes that contain only the digits (2, 3, 5).
 * @author Georg Fischer
 */
public class A214703 extends AbstractSequence {

  private int mN;
  private final char mDigit1;
  private final char mDigit2;
  private final char mDigit3;

  /** Construct the sequence. */
  public A214703() {
    this(1, 2, 3, 5);
  }

  /**
   * Generic constructor with parameters
   * @param offset first offset
   * @param digit1 lowest digit
   * @param digit2 middle digit
   * @param digit3 highest digit
   */
  public A214703(final int offset, final int digit1, final int digit2, final int digit3) {
    super(offset);
    mN = 2; // start with "10".substring(1)
    mDigit1 = Character.forDigit(digit1, 10);
    mDigit2 = Character.forDigit(digit2, 10);
    mDigit3 = Character.forDigit(digit3, 10);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      String repr3 = Long.toString(mN, 3);
      if (repr3.charAt(0) == '2') {
        mN = mN / 2 * 3;
        repr3 = Long.toString(mN, 3);
      }
      repr3 = repr3.substring(1)
        .replace('0', 'a')
        .replace('1', 'b')
        .replace('2', 'c')
        .replace('a', mDigit1)
        .replace('b', mDigit2)
        .replace('c', mDigit3);
      // System.out.println("mN=" + mN + ", repr3=" + repr3);
      if (!repr3.startsWith("0")) {
        final Z result = new Z(repr3);
        if (result.isProbablePrime()) {
          return result;
        }
      }
    }
  }
}
