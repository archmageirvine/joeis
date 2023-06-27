package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271939 Number of edges in the n-th order Sierpinski carpet graph.
 * @author Sean A. Irvine
 */
public class A271939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271939() {
    super(1, new long[] {-24, 11}, new long[] {8, 88});
  }
}
