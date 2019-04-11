package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026035 Expansion of <code>x^2*(2 - x + x^2) / ((1 + x)*(1 - x)^4)</code>.
 * @author Sean A. Irvine
 */
public class A026035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026035() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {2, 5, 12, 22, 38});
  }
}
