package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116798.
 * @author Sean A. Irvine
 */
public class A116798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116798() {
    super(new long[] {-3, 11, -15, 7}, new long[] {1, 2, 6, 21});
  }
}
