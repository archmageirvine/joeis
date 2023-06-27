package irvine.oeis.a284;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A284699 Number of dominating sets in the n-antiprism graph.
 * @author Sean A. Irvine
 */
public class A284699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A284699() {
    super(1, new long[] {1, 1, 1, 3, 3}, new long[] {3, 15, 57, 223, 863});
  }
}
