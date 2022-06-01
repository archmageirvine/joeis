package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122006 Expansion of x^2*(1-x)/((1-3*x)*(1-3*x^2)).
 * @author Sean A. Irvine
 */
public class A122006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122006() {
    super(new long[] {-9, 3, 3}, new long[] {0, 1, 2});
  }
}
