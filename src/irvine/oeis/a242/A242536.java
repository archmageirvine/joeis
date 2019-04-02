package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242536 Number of n-length words on {1,2,3,4} such that the maximal runs of identical odd integers are of odd length and the maximal runs of identical even integers are of even length.
 * @author Sean A. Irvine
 */
public class A242536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242536() {
    super(new long[] {-2, 2, 3, 1}, new long[] {1, 2, 4, 12});
  }
}
