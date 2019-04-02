package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090131 Expansion of (1+x)/(1 - 2*x + 2*x^2).
 * @author Sean A. Irvine
 */
public class A090131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090131() {
    super(new long[] {-2, 2}, new long[] {1, 3});
  }
}
