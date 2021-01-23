package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026244 a(n) = 4^n*(4^n+1)/2.
 * @author Sean A. Irvine
 */
public class A026244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026244() {
    super(new long[] {-64, 20}, new long[] {1, 10});
  }
}
