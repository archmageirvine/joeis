package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036547 <code>a(n) = T(6,n)</code>, array T given by <code>A048471</code>.
 * @author Sean A. Irvine
 */
public class A036547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036547() {
    super(new long[] {-3, 4}, new long[] {1, 65});
  }
}
