package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116996.
 * @author Sean A. Irvine
 */
public class A116996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116996() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 1, 4, 6, 10, 15});
  }
}
