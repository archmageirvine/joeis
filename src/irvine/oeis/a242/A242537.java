package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242537 Number of n-length words on {1,2,3,4,5} such that the maximal runs of identical odd integers are of odd length and the maximal runs of identical even integers are of even length.
 * @author Sean A. Irvine
 */
public class A242537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242537() {
    super(new long[] {-2, 2, 3, 2}, new long[] {1, 3, 8, 27});
  }
}
