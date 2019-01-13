package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116809.
 * @author Sean A. Irvine
 */
public class A116809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116809() {
    super(new long[] {1, -5, 13, -12, 6}, new long[] {1, 2, 6, 21, 76});
  }
}
