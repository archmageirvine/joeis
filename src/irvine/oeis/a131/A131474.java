package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131474 a(n) = ceiling(n/2)*ceiling(n^2/2).
 * @author Sean A. Irvine
 */
public class A131474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131474() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 1, 2, 10, 16, 39, 54});
  }
}
