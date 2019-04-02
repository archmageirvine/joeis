package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205248 Number of (n+1) X 2 0..1 arrays with the number of clockwise edge increases in every 2 X 2 subblock the same.
 * @author Sean A. Irvine
 */
public class A205248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205248() {
    super(new long[] {-3, 4}, new long[] {16, 40});
  }
}
