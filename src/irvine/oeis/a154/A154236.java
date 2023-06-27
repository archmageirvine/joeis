package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154236 a(n) = ( (5 + sqrt(6))^n - (5 - sqrt(6))^n )/(2*sqrt(6)).
 * @author Sean A. Irvine
 */
public class A154236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154236() {
    super(1, new long[] {-19, 10}, new long[] {1, 10});
  }
}
