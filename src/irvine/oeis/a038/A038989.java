package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038989 Expansion of <code>(1 - x^2 - 2*x^3) / (1 - 2*x - 2*x^2 - 2*x^3 + x^4)</code>.
 * @author Sean A. Irvine
 */
public class A038989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038989() {
    super(new long[] {-1, 2, 2, 2}, new long[] {1, 2, 5, 14});
  }
}
