package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037488.
 * @author Sean A. Irvine
 */
public class A037488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037488() {
    super(new long[] {-3, 1, 3}, new long[] {2, 7, 23});
  }
}
