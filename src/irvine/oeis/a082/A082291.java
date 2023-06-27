package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082291 Expansion of x(2 + 5x - x^2)/((1 - x)(1 - 6x + x^2)).
 * @author Sean A. Irvine
 */
public class A082291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082291() {
    super(1, new long[] {1, -7, 7}, new long[] {2, 19, 118});
  }
}
