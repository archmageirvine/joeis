package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211538.
 * @author Sean A. Irvine
 */
public class A211538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211538() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, 0, 1, 3});
  }
}
