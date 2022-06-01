package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097870 Molien series for group of order 4608 acting on joint weight enumerators of a pair of binary doubly-even self-dual codes.
 * @author Sean A. Irvine
 */
public class A097870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097870() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 2, 4, 10, 17, 27, 45, 66});
  }
}
