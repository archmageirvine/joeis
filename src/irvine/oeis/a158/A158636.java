package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158636 a(n) = 576*n^2 - 24.
 * @author Sean A. Irvine
 */
public class A158636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158636() {
    super(new long[] {1, -3, 3}, new long[] {552, 2280, 5160});
  }
}
