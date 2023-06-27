package irvine.oeis.a288;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A288516 Number of (undirected) paths in the ladder graph P_2 X P_n.
 * @author Sean A. Irvine
 */
public class A288516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288516() {
    super(1, new long[] {2, -9, 16, -14, 6}, new long[] {1, 12, 49, 146, 373});
  }
}
