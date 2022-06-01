package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174509 Continued fraction expansion for exp( Sum_{n&gt;=1} 1/(n*A086927(n)) ), where A086927(n) = (5+sqrt(26))^n + (5-sqrt(26))^n.
 * @author Sean A. Irvine
 */
public class A174509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174509() {
    super(new long[] {1, 0, 0, -103, 0, 0, 103, 0, 0}, new long[] {1, 9, 101, 1, 1029, 10401, 1, 105049, 1060901});
  }
}
