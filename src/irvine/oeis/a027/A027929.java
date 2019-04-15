package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027929 <code>T(n,2n-6),</code> T given by A027926.
 * @author Sean A. Irvine
 */
public class A027929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027929() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2, 5, 13, 33, 79, 176});
  }
}
