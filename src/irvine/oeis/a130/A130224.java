package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A130224 a(1) = 1; a(n) = a(n-1) + (number of times the digit 1 has appeared in the sequence so far).
 * @author Georg Fischer
 */
public class A130224 extends AbstractSequence {

  private int mDigit;
  private Z mA;
  private long mSum;

  /** Construct the sequence. */
  public A130224() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit count this digit
   */
  public A130224(final int offset, final int digit) {
    super(offset);
    mDigit = digit;
    mA = Z.valueOf(digit);
    mSum = 0;
  }

  @Override
  public Z next() {
    final Z result = mA;
    final int[] dc = ZUtils.digitCounts(mA);
    mSum += dc[mDigit];
    mA = mA.add(mSum);
//  System.out.println("mA=" + mA + ", mSum=" + mSum + ", result=" + result);
    return result;
  }
}
