package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063213 Dimension of the space of weight 2n cuspidal newforms for Gamma_0(45).
 * @author Sean A. Irvine
 */
public class A063213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063213() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 5, 9, 11});
  }
}
