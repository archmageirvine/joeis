package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054608 <code>a(n) = Sum_{d|9} phi(d)*n^(9/d)</code>.
 * @author Sean A. Irvine
 */
public class A054608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054608() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 9, 540, 19755, 262296, 1953405, 10078164, 40354335, 134218800, 387422001});
  }
}
