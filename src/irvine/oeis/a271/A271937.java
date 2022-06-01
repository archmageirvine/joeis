package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271937 a(n) = (7/4)*n^2 + (5/2)*n + (7 + (-1)^n)/8.
 * @author Sean A. Irvine
 */
public class A271937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271937() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 5, 13, 24});
  }
}
