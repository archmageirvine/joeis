package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084519 Number of indecomposable <code>ground-state 3-ball</code> juggling sequences of period <code>n</code>.
 * @author Sean A. Irvine
 */
public class A084519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084519() {
    super(new long[] {2, 2, 3}, new long[] {1, 1, 3});
  }
}
