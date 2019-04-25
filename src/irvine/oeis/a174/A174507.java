package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174507 Continued fraction expansion for exp( <code>Sum_{n&gt;=1}</code> 1/(n*A085447(n)) ), where A085447(n) <code>= (3+sqrt(10))^n + (3-sqrt(10))^n</code>.
 * @author Sean A. Irvine
 */
public class A174507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174507() {
    super(new long[] {1, 0, 0, -39, 0, 0, 39, 0, 0}, new long[] {1, 5, 37, 1, 233, 1441, 1, 8885, 54757});
  }
}
