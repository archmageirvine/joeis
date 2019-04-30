package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036548 <code>a(n) = T(7,n)</code>, array T given by A048471.
 * @author Sean A. Irvine
 */
public class A036548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036548() {
    super(new long[] {-3, 4}, new long[] {1, 129});
  }
}
