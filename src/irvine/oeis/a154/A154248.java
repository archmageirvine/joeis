package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154248 <code>a(n) = ( (7 + sqrt(7))^n - (7 - sqrt(7))^n )/(2*sqrt(7))</code>.
 * @author Sean A. Irvine
 */
public class A154248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154248() {
    super(new long[] {-42, 14}, new long[] {1, 14});
  }
}
