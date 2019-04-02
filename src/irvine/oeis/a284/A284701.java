package irvine.oeis.a284;

import irvine.oeis.LinearRecurrence;

/**
 * A284701 Number of maximal matchings in the n-antiprism graph.
 * @author Sean A. Irvine
 */
public class A284701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284701() {
    super(new long[] {-1, -2, 1, 5, 3, 0, 1, 2}, new long[] {2, 6, 14, 46, 137, 354, 905, 2366});
  }
}
