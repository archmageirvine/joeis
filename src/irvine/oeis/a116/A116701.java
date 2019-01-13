package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116701.
 * @author Sean A. Irvine
 */
public class A116701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116701() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 5, 13, 31});
  }
}
