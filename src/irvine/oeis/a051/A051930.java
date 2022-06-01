package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051930 Number of independent sets of vertices in graph K_5 X C_n (n &gt; 2).
 * @author Sean A. Irvine
 */
public class A051930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051930() {
    super(new long[] {1, 6, 4}, new long[] {6, 1, 31});
  }
}
