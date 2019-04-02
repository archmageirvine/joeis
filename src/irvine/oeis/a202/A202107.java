package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202107 n^4*(n+1)^4/8.
 * @author Sean A. Irvine
 */
public class A202107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202107() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {2, 162, 2592, 20000, 101250, 388962, 1229312, 3359232, 8201250});
  }
}
