package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164584 Expansion of <code>(1 + 6*x - 12*x^2 - 8*x^3)/(1 - 24*x^2 + 16*x^4)</code>.
 * @author Sean A. Irvine
 */
public class A164584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164584() {
    super(new long[] {-16, 0, 24, 0}, new long[] {1, 6, 12, 136});
  }
}
