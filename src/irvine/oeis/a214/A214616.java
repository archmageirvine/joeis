package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214616 n*(n+1)*(n+2)*(n+3)*(20*n^2+72*n+43)/360.
 * @author Sean A. Irvine
 */
public class A214616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214616() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 9, 89, 439, 1519, 4214, 10038});
  }
}
