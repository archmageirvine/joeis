package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122006 Expansion of <code>x^2*(1-x)/((1-3*x)*(1-3*x^2))</code>.
 * @author Sean A. Irvine
 */
public class A122006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122006() {
    super(new long[] {-9, 3, 3}, new long[] {0, 1, 2});
  }
}
