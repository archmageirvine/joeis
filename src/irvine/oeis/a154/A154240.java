package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154240 a(n) = ( (8 + sqrt(6))^n - (8 - sqrt(6))^n )/(2*sqrt(6)).
 * @author Sean A. Irvine
 */
public class A154240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154240() {
    super(1, new long[] {-58, 16}, new long[] {1, 16});
  }
}
