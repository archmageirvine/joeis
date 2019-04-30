package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273627 A divisibility sequence: <code>(1/8)*(Pell(4*n) - 2*Pell(2*n))</code>.
 * @author Sean A. Irvine
 */
public class A273627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273627() {
    super(new long[] {-1, 40, -206, 40}, new long[] {1, 48, 1715, 58752});
  }
}
