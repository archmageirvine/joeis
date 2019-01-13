package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116725.
 * @author Sean A. Irvine
 */
public class A116725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116725() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 2, 5, 12, 26});
  }
}
