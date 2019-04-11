package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154241 <code>a(n) = ( (9 + sqrt(6))^n - (9 - sqrt(6))^n )/(2*sqrt(6))</code>.
 * @author Sean A. Irvine
 */
public class A154241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154241() {
    super(new long[] {-75, 18}, new long[] {1, 18});
  }
}
