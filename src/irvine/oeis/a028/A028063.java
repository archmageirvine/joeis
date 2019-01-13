package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028063.
 * @author Sean A. Irvine
 */
public class A028063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028063() {
    super(new long[] {-1260, 957, -251, 27}, new long[] {1, 27, 478, 7086});
  }
}
