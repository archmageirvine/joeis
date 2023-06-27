package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154249 a(n) = ( (8 + sqrt(7))^n - (8 - sqrt(7))^n )/(2*sqrt(7)).
 * @author Sean A. Irvine
 */
public class A154249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154249() {
    super(1, new long[] {-57, 16}, new long[] {1, 16});
  }
}
