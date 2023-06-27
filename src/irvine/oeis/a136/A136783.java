package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136783 Number of multiplex juggling sequences of length n, base state &lt;3&gt; and hand capacity 3.
 * @author Sean A. Irvine
 */
public class A136783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136783() {
    super(1, new long[] {20, -27, 10}, new long[] {1, 4, 20});
  }
}
