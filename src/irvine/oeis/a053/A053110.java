package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053110.
 * @author Sean A. Irvine
 */
public class A053110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053110() {
    super(new long[] {823543, -823543, 352947, -84035, 12005, -1029, 49}, new long[] {1, 28, 588, 10290, 158466, 2218524, 28840812});
  }
}
