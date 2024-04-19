package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A073053 Apply DENEAT operator (or the Sisyphus function) to n.
 * @author Georg Fischer
 */
public class A073053 extends AbstractSequence {

  private long mN;

  /** Construct the sequence. */
  public A073053() {
    super(0);
    mN = getOffset() - 1;
  }

  /**
   * Compute the function DENEAT(n): concatenate number of even digits in n, number of odd digits and total number of digits.
   * @param n base number
   * @return concatenation of three counts in base 10
   */
  public static Z deneat(final Z n) {
    int even = 0;
    int odd = 0;
    final int[] counts = ZUtils.digitCounts(n);
    for (int i = counts.length - 1; i >= 0; --i) {
      if ((i & 1) == 0) {
        even += counts[i];
      } else {
        odd += counts[i];
      }
    }
    return new Z(String.valueOf(even) + odd + (even + odd));
  }

  @Override
  public Z next() {
    return deneat(Z.valueOf(++mN));
  }
}
