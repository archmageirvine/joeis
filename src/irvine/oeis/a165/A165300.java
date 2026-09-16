package irvine.oeis.a165;

import irvine.math.z.Z;
import irvine.oeis.recur.MexSequence;

/**
 * A165300 a(n) is the smallest number not already present that permits the cyclic repetition of the path 1,2 of the digits in the sequence.
 * @author Georg Fischer
 */
public class A165300 extends MexSequence {

  private long mPeriod;

  /** Construct the sequence. */
  public A165300() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param period digits 1 up to <code>period</code> must occur periodically
   */
  public A165300(final int offset, final long period) {
    super(offset,
      (self, n) -> {
        long digit = self.a(n - 1).mod(10);
        digit = digit % period;
        Z result = Z.valueOf(digit + 1);
        while (self.contains(result)) {
          digit = (digit + 1) % period;
          result = result.multiply(10).add(digit + 1);
        }
        return result;
      }, "1");
  }

}
