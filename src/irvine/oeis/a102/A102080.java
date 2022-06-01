package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102080 Number of matchings in the C_n X P_2 (n-prism) graph.
 * @author Sean A. Irvine
 */
public class A102080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102080() {
    super(new long[] {-1, 0, 4, 2}, new long[] {2, 12, 32, 108});
  }
}
