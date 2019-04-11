package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292534 p-INVERT of the squares (A000290), where p(S) <code>= 1 +</code> S - S^2.
 * @author Sean A. Irvine
 */
public class A292534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292534() {
    super(new long[] {-1, 7, -16, 22, -12, 5}, new long[] {-1, -2, 4, 21, 30, 11});
  }
}
