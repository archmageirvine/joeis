package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052379 Number of integers from 1 to 10^(n+1)-1 that lack 0 and 1 as a digit.
 * @author Sean A. Irvine
 */
public class A052379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052379() {
    super(new long[] {-8, 9}, new long[] {8, 72});
  }
}
