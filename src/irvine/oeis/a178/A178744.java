package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178744 Partial sums of floor(4^n/9).
 * @author Sean A. Irvine
 */
public class A178744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178744() {
    super(new long[] {4, -5, 1, -4, 5}, new long[] {0, 0, 1, 8, 36});
  }
}
