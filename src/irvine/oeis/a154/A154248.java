package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154248 a(n) = ( (7 + sqrt(7))^n - (7 - sqrt(7))^n )/(2*sqrt(7)).
 * @author Sean A. Irvine
 */
public class A154248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154248() {
    super(1, new long[] {-42, 14}, new long[] {1, 14});
  }
}
