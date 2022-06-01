package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062708 Write 0,1,2,3,4,... in a triangular spiral; then a(n) is the sequence found by reading the terms along the line from 0 in the direction 0,2,...
 * @author Sean A. Irvine
 */
public class A062708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062708() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 13});
  }
}
