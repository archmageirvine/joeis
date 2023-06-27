package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154237 a(n) = ( (6 + sqrt(6))^n - (6 - sqrt(6))^n )/(2*sqrt(6)).
 * @author Sean A. Irvine
 */
public class A154237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154237() {
    super(1, new long[] {-30, 12}, new long[] {1, 12});
  }
}
