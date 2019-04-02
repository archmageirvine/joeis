package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077263 Number of (undirected) cycles in the n-th order antiprism graph.
 * @author Sean A. Irvine
 */
public class A077263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077263() {
    super(new long[] {-1, 2, -3, 8, -11, 6}, new long[] {63, 179, 523, 1619, 5239, 17379});
  }
}
