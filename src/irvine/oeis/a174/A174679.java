package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174679 a(4n) = n^2. a(4n+1) = (4n-1)^2. a(4n+2) = (2n)^2. a(4n+3) = (4n+1)^2.
 * @author Sean A. Irvine
 */
public class A174679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174679() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 1, 0, 1, 1, 9, 4, 25, 4, 49, 16, 81});
  }
}
