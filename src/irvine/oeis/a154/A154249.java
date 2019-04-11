package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154249 <code>a(n) = ( (8 + sqrt(7))^n - (8 - sqrt(7))^n )/(2*sqrt(7))</code>.
 * @author Sean A. Irvine
 */
public class A154249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154249() {
    super(new long[] {-57, 16}, new long[] {1, 16});
  }
}
