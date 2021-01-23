package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174501 Continued fraction expansion for exp( Sum_{n&gt;=1} 1/(n*A003499(n)) ), where A003499(n) = (3+sqrt(8))^n + (3-sqrt(8))^n.
 * @author Sean A. Irvine
 */
public class A174501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174501() {
    super(new long[] {1, 0, -7, 0, 7, 0}, new long[] {1, 4, 1, 32, 1, 196});
  }
}
