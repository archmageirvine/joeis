package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028552.
 * @author Sean A. Irvine
 */
public class A028552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028552() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 10});
  }
}
