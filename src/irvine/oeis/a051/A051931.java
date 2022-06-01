package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051931 Number of independent sets of nodes in graph K_6 X C_n (n &gt; 2).
 * @author Sean A. Irvine
 */
public class A051931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051931() {
    super(new long[] {1, 7, 5}, new long[] {7, 1, 43});
  }
}
