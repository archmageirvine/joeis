package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122519 Expansion of x * (x+1) * (x^3-x^2-1) / ((x^2+1) * (x^3+x^2-1)).
 * @author Sean A. Irvine
 */
public class A122519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122519() {
    super(new long[] {1, 1, 1, 0, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
