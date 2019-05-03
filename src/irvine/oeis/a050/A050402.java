package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050402 Number of independent sets of nodes in <code>C_4 X C_n (n &gt; 2)</code>.
 * @author Sean A. Irvine
 */
public class A050402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050402() {
    super(new long[] {1, -2, -7, 8, 15, 2}, new long[] {7, 1, 35, 121, 743, 3561});
  }
}
