package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225883 <code>a(n) = (-1)^n * (1 - 2^n)</code>.
 * @author Sean A. Irvine
 */
public class A225883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225883() {
    super(new long[] {-2, -3}, new long[] {0, 1});
  }
}
