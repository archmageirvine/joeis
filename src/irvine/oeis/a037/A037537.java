package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037537.
 * @author Sean A. Irvine
 */
public class A037537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037537() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 6, 25, 101});
  }
}
