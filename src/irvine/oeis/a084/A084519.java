package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084519 Number of indecomposable ground-state 3-ball juggling sequences of period n.
 * @author Sean A. Irvine
 */
public class A084519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084519() {
    super(new long[] {2, 2, 3}, new long[] {1, 1, 3});
  }
}
