package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154691.
 * @author Sean A. Irvine
 */
public class A154691 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154691() {
    super(new long[] {-1, 0, 2}, new long[] {1, 3, 7});
  }
}
