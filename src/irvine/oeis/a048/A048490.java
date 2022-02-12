package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048490 a(n) = T(7,n), array T given by A048483.
 * @author Sean A. Irvine
 */
public class A048490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048490() {
    super(new long[] {-2, 3}, new long[] {1, 9});
  }
}
