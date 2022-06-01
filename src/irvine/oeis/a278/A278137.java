package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278137 Maximum number of disjoint subgraphs of the Fibonacci cube Gamma(n) that are isomorphic to the hypercube of dimension k, summed over all k.
 * @author Sean A. Irvine
 */
public class A278137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278137() {
    super(new long[] {-1, -2, 0, 2, 1}, new long[] {1, 3, 4, 8, 13});
  }
}
