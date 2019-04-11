package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271945 Expansion of <code>4*x^2/(1 - x - 9*x^2 + x^3)</code>.
 * @author Sean A. Irvine
 */
public class A271945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271945() {
    super(new long[] {-1, 9, 1}, new long[] {0, 0, 4});
  }
}
