package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195856 <code>a(n) = T(10,n),</code> array T given by A048505.
 * @author Sean A. Irvine
 */
public class A195856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195856() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 122, 387, 965});
  }
}
