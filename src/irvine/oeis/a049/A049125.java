package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;
import irvine.oeis.transform.RevertTransformSequence;

/**
 * A049125 Revert transform of (1 + x - x^2) / (1 + x)^2.
 * 1, 1, 2, 4, 10, 25, 68, 187, 534, 1544, 4554, 13576, 40968
 *
 * @author Georg Fischer
 */
public class A049125 extends RevertTransformSequence {

  /**
   * Construct the sequence
   */
  public A049125() {
    this(new long[] {1, 1, -1}, new long[] {1, 2, 1});
  }

  /**
   * Generic constructor with parameters
   *
   * @param num numerator of ordinary generating function
   * @param den denominator
   */
  public A049125(final long[] num, final long[] den) {
    super(new GeneratingFunctionSequence(num, den));
  }

  @Override
  public Z next() {
    return super.next();
  }
}
