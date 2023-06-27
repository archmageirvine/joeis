package irvine.oeis.a273;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A273627 A divisibility sequence: (1/8)*(Pell(4*n) - 2*Pell(2*n)).
 * @author Sean A. Irvine
 */
public class A273627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273627() {
    super(1, new long[] {-1, 40, -206, 40}, new long[] {1, 48, 1715, 58752});
  }
}
