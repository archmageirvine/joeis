package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048513 <code>a(n) = T(8,n)</code>, array T given by <code>A048505</code>.
 * @author Sean A. Irvine
 */
public class A048513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048513() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 82, 263, 665});
  }
}
