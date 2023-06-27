package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192848 Molecular topological indices of the graph join C_n + C_n of cycle graphs.
 * @author Sean A. Irvine
 */
public class A192848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192848() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {12, 96, 300, 672});
  }
}
