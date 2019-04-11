package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154340 <code>a(n) = ( (5 + 2*sqrt(2))^n - (5 - 2*sqrt(2))^n )/(4*sqrt(2))</code>.
 * @author Sean A. Irvine
 */
public class A154340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154340() {
    super(new long[] {-17, 10}, new long[] {1, 10});
  }
}
