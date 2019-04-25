package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174500 Continued fraction expansion for exp( <code>Sum_{n&gt;=1}</code> 1/(n*A003500(n)) ), where A003500(n) <code>= (2+sqrt(3))^n + (2-sqrt(3))^n</code>.
 * @author Sean A. Irvine
 */
public class A174500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174500() {
    super(new long[] {1, 0, -5, 0, 5, 0}, new long[] {1, 2, 1, 12, 1, 50});
  }
}
