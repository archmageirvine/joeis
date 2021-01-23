package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051929 Number of independent sets of vertices in graph K_4 X C_n (n &gt; 2).
 * @author Sean A. Irvine
 */
public class A051929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051929() {
    super(new long[] {1, 5, 3}, new long[] {5, 1, 21});
  }
}
