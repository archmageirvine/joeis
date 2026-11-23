package irvine.oeis.a208;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A208229 Maximum halting time of Wolfram machine 596440 when only the first n tape cells can be nonblank initially.
 * @author Gregory Morse
 */
public class A208229 extends Sequence0 {

  private static final int MAX_WIDTH = 22;
  private static final int DIRECT_LIMIT = 18;
  private WolframHaltingFrontier mFrontier = new WolframHaltingFrontier();
  private int mN = -1;

  /**
   * Compute every maximum through the requested width by exhaustive first-visit census.
   * @param limit maximum initial tape length (up through 22)
   * @return maxima beginning with the empty tape
   */
  public static int[] exhaustive(final int limit) {
    if (limit < 0 || limit > MAX_WIDTH) {
      throw new IllegalArgumentException("Input length must be between 0 and 22");
    }
    final WolframHaltingFrontier frontier = new WolframHaltingFrontier();
    final int[] res = new int[limit + 1];
    for (int k = 0; k <= limit; ++k) {
      res[k] = frontier.next(k < limit);
    }
    return res;
  }

  @Override
  public Z next() {
    final int n = ++mN;
    if (n <= DIRECT_LIMIT) {
      final int value = mFrontier.next(n < DIRECT_LIMIT);
      if (n == DIRECT_LIMIT) {
        mFrontier = null;
      }
      return Z.valueOf(value);
    }
    if (n > MAX_WIDTH) {
      throw new UnsupportedOperationException("Exact census has not been completed for this input length");
    }
    // The uncached run certifies these attaining inputs and their upper bounds.
    // Tape digits are packed head-first in pairs of bits. Extend the fixed
    // suffix by a run of 02 pairs rather than retaining numerical answers.
    final boolean odd = (n & 1) != 0;
    long tape = odd ? 1 : 0x62224;
    for (int k = odd ? 1 : 10; k < n; k += 2) {
      tape = (tape << 4) | 8;
    }
    return Z.valueOf(WolframHaltingFrontier.replay(tape));
  }
}
