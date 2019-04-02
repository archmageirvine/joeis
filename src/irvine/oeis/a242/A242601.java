package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242601 Integers repeated twice in a canonical order.
 * @author Sean A. Irvine
 */
public class A242601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242601() {
    super(new long[] {1, -1, 2, -2, 1}, new long[] {0, 0, 1, 1, -1});
  }
}
