package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163614 <code>a(n) = ((1 + 3*sqrt(2))*(3 + sqrt(2))^n + (1 - 3*sqrt(2))*(3 - sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A163614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163614() {
    super(new long[] {-7, 6}, new long[] {1, 9});
  }
}
