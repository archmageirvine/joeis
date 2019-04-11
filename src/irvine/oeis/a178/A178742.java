package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178742 Partial sums of <code>floor(2^n/9)</code>.
 * @author Sean A. Irvine
 */
public class A178742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178742() {
    super(new long[] {2, -5, 4, 1, -5, 4}, new long[] {0, 0, 0, 0, 1, 4});
  }
}
