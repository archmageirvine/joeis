package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036543 <code>a(n) = T(3,n)</code>, array T given by <code>A048471</code>.
 * @author Sean A. Irvine
 */
public class A036543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036543() {
    super(new long[] {-3, 4}, new long[] {1, 9});
  }
}
