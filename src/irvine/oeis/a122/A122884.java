package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122884 a(n+1) = 4*a(n) + 11*a(n-1) - 2*a(n-3).
 * @author Sean A. Irvine
 */
public class A122884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122884() {
    super(1, new long[] {-2, 11, 4}, new long[] {1, 7, 39});
  }
}
