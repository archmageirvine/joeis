package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242602 Integers repeated thrice in a canonical order.
 * @author Sean A. Irvine
 */
public class A242602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242602() {
    super(new long[] {1, -1, 0, 2, -2, 0, 1}, new long[] {0, 0, 0, 1, 1, 1, -1});
  }
}
