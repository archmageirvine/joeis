package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105938 <code>a(n) = binomial(n+2,2)*binomial(n+5,2)</code>.
 * @author Sean A. Irvine
 */
public class A105938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105938() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {10, 45, 126, 280, 540});
  }
}
