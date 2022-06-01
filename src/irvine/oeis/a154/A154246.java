package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154246 a(n) = ( (5 + sqrt(7))^n - (5 - sqrt(7))^n )/(2*sqrt(7)).
 * @author Sean A. Irvine
 */
public class A154246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154246() {
    super(new long[] {-18, 10}, new long[] {1, 10});
  }
}
