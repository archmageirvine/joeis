package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127357 Expansion of <code>1/(1 - 2*x + 9*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A127357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127357() {
    super(new long[] {-9, 2}, new long[] {1, 2});
  }
}
