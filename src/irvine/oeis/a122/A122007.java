package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122007 Expansion of <code>2*x^2*(1-2*x) / ((3*x-1)*(3*x^2-1))</code>.
 * @author Sean A. Irvine
 */
public class A122007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122007() {
    super(new long[] {-9, 3, 3}, new long[] {0, 2, 2});
  }
}
