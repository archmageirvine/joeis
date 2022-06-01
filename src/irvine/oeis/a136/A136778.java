package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136778 Number of primitive multiplex juggling sequences of length n, base state &lt;2,1&gt; and hand capacity 2.
 * @author Sean A. Irvine
 */
public class A136778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136778() {
    super(new long[] {-3, -9, 7}, new long[] {1, 3, 15});
  }
}
