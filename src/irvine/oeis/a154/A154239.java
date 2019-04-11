package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154239 <code>a(n) = ( (7 + sqrt(6))^n - (7 - sqrt(6))^n )/(2*sqrt(6))</code>.
 * @author Sean A. Irvine
 */
public class A154239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154239() {
    super(new long[] {-43, 14}, new long[] {1, 14});
  }
}
