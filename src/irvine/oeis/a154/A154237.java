package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154237 <code>a(n) = ( (6 + sqrt(6))^n - (6 - sqrt(6))^n )/(2*sqrt(6))</code>.
 * @author Sean A. Irvine
 */
public class A154237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154237() {
    super(new long[] {-30, 12}, new long[] {1, 12});
  }
}
