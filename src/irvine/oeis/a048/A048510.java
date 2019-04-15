package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048510 <code>a(n) = T(5,n),</code> array T given by A048505.
 * @author Sean A. Irvine
 */
public class A048510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048510() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 37, 122, 320});
  }
}
