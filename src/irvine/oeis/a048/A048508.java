package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048508 a(n) = T(3,n), array T given by A048505.
 * @author Sean A. Irvine
 */
public class A048508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048508() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 17, 58, 160});
  }
}
