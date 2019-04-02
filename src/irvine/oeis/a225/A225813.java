package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225813 a(n) = (10^n)^2 + 7(10^n) + 1.
 * @author Sean A. Irvine
 */
public class A225813 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225813() {
    super(new long[] {1000, -1110, 111}, new long[] {9, 171, 10701});
  }
}
