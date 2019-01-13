package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116969.
 * @author Sean A. Irvine
 */
public class A116969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116969() {
    super(new long[] {2, -3, -1, 3}, new long[] {4, 7, 15, 27});
  }
}
