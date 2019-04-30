package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136780 Number of primitive multiplex juggling sequences of length n, base state <code>&lt;1,1,1&gt</code>; and hand capacity 2.
 * @author Sean A. Irvine
 */
public class A136780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136780() {
    super(new long[] {-7, -8, 7}, new long[] {1, 2, 13});
  }
}
