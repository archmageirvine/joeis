package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154247 a(n) = ( (6 + sqrt(7))^n - (6 - sqrt(7))^n )/(2*sqrt(7)).
 * @author Sean A. Irvine
 */
public class A154247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154247() {
    super(new long[] {-29, 12}, new long[] {1, 12});
  }
}
