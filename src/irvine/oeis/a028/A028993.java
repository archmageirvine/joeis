package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028993 Odd <code>10-gonal (or decagonal)</code> numbers.
 * @author Sean A. Irvine
 */
public class A028993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028993() {
    super(new long[] {1, -3, 3}, new long[] {1, 27, 85});
  }
}
