package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154347 a(n) = ( (7 + 2*sqrt(2))^n - (7 - 2*sqrt(2))^n )/(4*sqrt(2)).
 * @author Sean A. Irvine
 */
public class A154347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154347() {
    super(new long[] {-41, 14}, new long[] {1, 14});
  }
}
