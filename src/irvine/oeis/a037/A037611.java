package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037611.
 * @author Sean A. Irvine
 */
public class A037611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037611() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 7, 30, 121});
  }
}
