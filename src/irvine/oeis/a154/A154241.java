package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154241 a(n) = ( (9 + sqrt(6))^n - (9 - sqrt(6))^n )/(2*sqrt(6)).
 * @author Sean A. Irvine
 */
public class A154241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154241() {
    super(new long[] {-75, 18}, new long[] {1, 18});
  }
}
