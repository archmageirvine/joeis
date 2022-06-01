package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254031 a(n) = 1*5^n + 2*4^n + 3*3^n + 4*2^n + 5*1^n.
 * @author Sean A. Irvine
 */
public class A254031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254031() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {15, 35, 105, 371, 1449});
  }
}
