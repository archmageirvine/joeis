package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A214703 Primes having only {0, 1, 2, 4} as digits.
 * @author Georg Fischer
 */
public class A386017 extends AbstractSequence {

  private int mN;
  private final char mDigit1;
  private final char mDigit2;
  private final char mDigit3;
  private final char mDigit4;

  /** Construct the sequence. */
  public A386017() {
    this(1, 0, 1, 2, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first offset
   * @param digit1 lowest digit
   * @param digit2 lower digit
   * @param digit3 higher digit
   * @param digit4 highest digit
   */
  public A386017(final int offset, final int digit1, final int digit2, final int digit3, final int digit4) {
    super(offset);
    mN = 3; // next() starts with "10".substring(1)
    mDigit1 = Character.forDigit(digit1, 10);
    mDigit2 = Character.forDigit(digit2, 10);
    mDigit3 = Character.forDigit(digit3, 10);
    mDigit4 = Character.forDigit(digit4, 10);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      String repr = Long.toString(mN, 4);
      if (repr.charAt(0) == '2') {
        mN = mN / 2 * 4;
        repr = Long.toString(mN, 4);
      }
      repr = repr.substring(1)
        .replace('0', 'a')
        .replace('1', 'b')
        .replace('2', 'c')
        .replace('3', 'd')
        .replace('a', mDigit1)
        .replace('b', mDigit2)
        .replace('c', mDigit3)
        .replace('d', mDigit4)
      ;
      // System.out.println("mN=" + mN + ", repr=" + repr);
      final char last = repr.charAt(repr.length() - 1);
      if ((mN <= 8 || ((last & 1) != 0 && last != '5')) && repr.charAt(0) != '0') {
        final Z result = new Z(repr);
        if (result.isProbablePrime()) {
          return result;
        }
      }
    }
  }
}
