package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291225 p-INVERT of (0,1,0,1,0,1,...), where p(S) = (1 - S)^5.
 * @author Sean A. Irvine
 */
public class A291225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291225() {
    super(new long[] {1, 5, 5, -10, -15, 11, 15, -10, -5, 5}, new long[] {5, 15, 40, 100, 236, 535, 1175, 2515, 5270, 10846});
  }
}
