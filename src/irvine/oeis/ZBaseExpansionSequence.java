package irvine.oeis;

import java.io.Serializable;

import irvine.math.z.Z;

/**
 * Sequence of digits in some number base, formed by the expansion of an integer number.
 * The number must be positive, and the first sequence term is the leftmost digit.
 * @author Georg Fischer
 */
public class ZBaseExpansionSequence extends RealConstantSequence implements Serializable {

  private final String mS;
  private final int mLenS;
  protected int mN;

  /**
   * Construct a new expansion of an integer
   * @param offset OEIS offset
   * @param x the number
   * @param base base for expansion
   * <code>offset</code> here is supposed to be number of digits before decimal point.
   * Caveat: Some offsets in the OEIS are 1 because the real offset would be too huge.
   */
  public ZBaseExpansionSequence(final int offset, final Z x, final int base) {
    super(offset, null); // do not really use the superclass
    mS = x.toString(base); // first we convert the whole number into a String 
    mLenS = mS.length();
    mN = -1;
  }

  /**
   * Construct a new expansion of an integer with default base 10.
   * @param offset OEIS offset
   * @param x the number
   */
  protected ZBaseExpansionSequence(final int offset, final Z x) {
    this(offset, x, 10);
  }

  /**
   * Construct a new expansion of an integer with default offset 1.
   * @param x the number
   */
  protected ZBaseExpansionSequence(final Z x) {
    this(1, x);
  }

  @Override
  public Z next() {
    ++mN;
    final char c = mN < mLenS ? mS.charAt(mN) : '0';
    return Z.valueOf(c <= '9' ? c - '0' : c - 'a' + 10);
  }
}
