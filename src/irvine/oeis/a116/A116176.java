package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116176.
 * @author Sean A. Irvine
 */
public class A116176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116176() {
    super(new long[] {729, -243, 27}, new long[] {0, 18, 486});
  }
}
