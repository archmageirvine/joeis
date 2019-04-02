package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198686 4*7^n-1.
 * @author Sean A. Irvine
 */
public class A198686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198686() {
    super(new long[] {-7, 8}, new long[] {3, 27});
  }
}
