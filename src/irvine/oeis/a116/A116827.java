package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116827.
 * @author Sean A. Irvine
 */
public class A116827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116827() {
    super(new long[] {4, -36, 137, -292, 386, -329, 181, -62, 12}, new long[] {1, 2, 6, 21, 74, 249, 798, 2459, 7351});
  }
}
