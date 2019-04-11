package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157949 <code>a(n) = 128*n - 1</code>.
 * @author Sean A. Irvine
 */
public class A157949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157949() {
    super(new long[] {-1, 2}, new long[] {127, 255});
  }
}
