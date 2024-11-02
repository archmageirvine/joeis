package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122572 a(n) = -14*a(n-1) - a(n-2), with a(1) = a(2) = 1.
 * @author Sean A. Irvine
 */
public class A122572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122572() {
    super(1, new long[] {-1, -14}, new long[] {1, 1});
  }
}
