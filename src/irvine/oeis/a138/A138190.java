package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138190 Numerator of (n-1)*n*(n+1)/12.
 * @author Sean A. Irvine
 */
public class A138190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138190() {
    super(1, new long[] {-1, 0, 0, 0, 4, 0, 0, 0, -6, 0, 0, 0, 4, 0, 0, 0}, new long[] {0, 1, 2, 5, 10, 35, 28, 42, 60, 165, 110, 143, 182, 455, 280, 340});
  }
}
