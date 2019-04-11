package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107906 Expansion of <code>(1+8x)/(1-16x^2)</code>.
 * @author Sean A. Irvine
 */
public class A107906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107906() {
    super(new long[] {16, 0}, new long[] {1, 8});
  }
}
