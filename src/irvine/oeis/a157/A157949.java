package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157949.
 * @author Sean A. Irvine
 */
public class A157949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157949() {
    super(new long[] {-1, 2}, new long[] {127, 255});
  }
}
