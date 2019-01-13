package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076264.
 * @author Sean A. Irvine
 */
public class A076264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076264() {
    super(new long[] {-1, 0, 3}, new long[] {1, 3, 9});
  }
}
