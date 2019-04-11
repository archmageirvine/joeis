package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154246 <code>a(n) = ( (5 + sqrt(7))^n - (5 - sqrt(7))^n )/(2*sqrt(7))</code>.
 * @author Sean A. Irvine
 */
public class A154246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154246() {
    super(new long[] {-18, 10}, new long[] {1, 10});
  }
}
