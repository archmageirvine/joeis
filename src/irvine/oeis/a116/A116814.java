package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116814.
 * @author Sean A. Irvine
 */
public class A116814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116814() {
    super(new long[] {4, -40, 165, -369, 496, -418, 222, -72, 13}, new long[] {1, 2, 6, 21, 75, 258, 845, 2649, 8019});
  }
}
