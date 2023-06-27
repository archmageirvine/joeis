package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136780 Number of primitive multiplex juggling sequences of length n, base state &lt;1,1,1&gt; and hand capacity 2.
 * @author Sean A. Irvine
 */
public class A136780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136780() {
    super(1, new long[] {-7, -8, 7}, new long[] {1, 2, 13});
  }
}
