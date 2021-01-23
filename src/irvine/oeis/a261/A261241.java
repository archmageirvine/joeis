package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261241 One half of numbers representable in at least two different ways as sums of four nonvanishing cubes. See A259060 for these numbers and their representations.
 * @author Sean A. Irvine
 */
public class A261241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261241() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3213, 3950, 4807, 5796});
  }
}
