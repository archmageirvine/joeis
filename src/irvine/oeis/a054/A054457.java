package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054457 Pell numbers A000129(n+1) (without P(0)) convoluted twice with itself.
 * @author Sean A. Irvine
 */
public class A054457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054457() {
    super(new long[] {1, 6, 9, -4, -9, 6}, new long[] {1, 6, 27, 104, 366, 1212});
  }
}
