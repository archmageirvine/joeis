package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107906 Expansion of (1+8x)/(1-16x^2).
 * @author Sean A. Irvine
 */
public class A107906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107906() {
    super(new long[] {16, 0}, new long[] {1, 8});
  }
}
