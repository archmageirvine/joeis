package irvine.oeis.a000;

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A000144 Number of ways of writing n as a sum of 10 squares.
 * @author Georg Fischer
 */
public class A000144 extends EulerTransform {

  /** Construct the sequence. */
  public A000144() {
    this(0, 10);
  }

  /**
   * Generic constructor with parameters.
   * The period is that of theta_3 (2, -3, 2, -1) multiplied with the count.
   * @param offset first index
   * @param count number of squares to be summed
   */
  public A000144(final int offset, final int count) {
    super(offset, new PaddingSequence(new long[] {}, new long[] {2L * count, -3L * count, 2L * count, -count}), 1);
  }
}
