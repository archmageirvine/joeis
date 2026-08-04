package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288031 Number of edge covers in the grid graph P_3 X P_n.
 * @author Georg Fischer
 */
public class A288031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288031() {
    super(0, new long[] {8, 10, -95, 24, 100, 20}, new long[] {1, 1, 43, 969, 23663, 571099});
  }
}
