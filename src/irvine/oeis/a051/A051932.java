package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051932 Number of independent sets of nodes in graph K_7 X C_n (n &gt; 2).
 * @author Sean A. Irvine
 */
public class A051932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051932() {
    super(new long[] {1, 8, 6}, new long[] {8, 1, 57});
  }
}
