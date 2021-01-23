package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048513 a(n) = T(8,n), array T given by A048505.
 * @author Sean A. Irvine
 */
public class A048513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048513() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 82, 263, 665});
  }
}
