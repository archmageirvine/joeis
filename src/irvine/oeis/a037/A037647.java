package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037647.
 * @author Sean A. Irvine
 */
public class A037647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037647() {
    super(new long[] {-5, 1, 0, 5}, new long[] {3, 15, 76, 383});
  }
}
