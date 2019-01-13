package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028124.
 * @author Sean A. Irvine
 */
public class A028124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028124() {
    super(new long[] {-1800, 1190, -281, 28}, new long[] {1, 28, 503, 7406});
  }
}
