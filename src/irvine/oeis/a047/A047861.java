package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047861 <code>a(n) =</code> T(4,n), array T given by A047858.
 * @author Sean A. Irvine
 */
public class A047861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047861() {
    super(new long[] {4, -8, 5}, new long[] {1, 6, 17});
  }
}
