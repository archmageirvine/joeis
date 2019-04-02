package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265672 a(n) = n + floor((n+1)/7)*(-1)^((n+1) mod 7).
 * @author Sean A. Irvine
 */
public class A265672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265672() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 3, 4, 5, 7, 6, 9, 8, 11, 10, 13, 15});
  }
}
