package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116972.
 * @author Sean A. Irvine
 */
public class A116972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116972() {
    super(new long[] {3, -7, 5}, new long[] {1, 21, 85});
  }
}
