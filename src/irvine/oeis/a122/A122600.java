package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122600 Expansion of <code>1/(1 + 3*x - 4*x^2 + x^3)</code>.
 * @author Sean A. Irvine
 */
public class A122600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122600() {
    super(new long[] {-1, 4, -3}, new long[] {1, -3, 13});
  }
}
