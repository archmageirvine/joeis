package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273321 Wiener index of graph of b.c.c. unit cells in a line = Sum of distances in a b.c.c. row graph.
 * @author Sean A. Irvine
 */
public class A273321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273321() {
    super(new long[] {-1, 4, -6, 4}, new long[] {64, 206, 488, 960});
  }
}
