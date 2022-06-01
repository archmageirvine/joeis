package irvine.oeis.a246;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A246943 a(4n) = 4*n , a(2n+1) = 8*n+4 , a(4n+2) = 2*n+1.
 * @author Sean A. Irvine
 */
public class A246943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246943() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 4, 1, 12, 4, 20, 3, 28});
  }
}
