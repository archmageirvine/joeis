package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116734.
 * @author Sean A. Irvine
 */
public class A116734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116734() {
    super(new long[] {1, -1, 0, -2, 3}, new long[] {1, 2, 5, 12, 25});
  }
}
