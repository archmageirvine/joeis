package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079326 a(n) = the largest number m such that if m monominoes are removed from an n X n square then an L-tromino must remain.
 * @author Sean A. Irvine
 */
public class A079326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079326() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 7, 9, 17});
  }
}
