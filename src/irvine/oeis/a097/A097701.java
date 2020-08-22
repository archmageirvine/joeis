package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097701 Expansion of 1/((1-x)^2*(1-x^2)^2*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A097701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097701() {
    super(new long[] {1, -2, -1, 3, 1, -1, -3, 1, 2}, new long[] {1, 2, 5, 9, 16, 25, 39, 56, 80});
  }
}
