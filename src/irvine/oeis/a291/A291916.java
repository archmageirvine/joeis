package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291916 Number of (not necessarily maximum) cliques in the n-Fibonacci cube graph.
 * @author Sean A. Irvine
 */
public class A291916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291916() {
    super(new long[] {1, 1, -3, -1, 3}, new long[] {4, 6, 11, 19, 34});
  }
}
