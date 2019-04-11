package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174503 Continued fraction expansion for exp( Sum_{n&gt;=1} 1/(n*A087799(n)) ), where A087799(n) <code>= (5+sqrt(24))^n + (5-sqrt(24))^n</code>.
 * @author Sean A. Irvine
 */
public class A174503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174503() {
    super(new long[] {1, 0, -11, 0, 11, 0}, new long[] {1, 8, 1, 96, 1, 968});
  }
}
