package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133654 <code>a(n) = 2*A000129(n) - 1</code>.
 * @author Sean A. Irvine
 */
public class A133654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133654() {
    super(new long[] {-1, -1, 3}, new long[] {1, 3, 9});
  }
}
