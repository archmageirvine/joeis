package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292534 p-INVERT of the squares <code>(A000290)</code>, where <code>p(S) = 1 + S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A292534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292534() {
    super(new long[] {-1, 7, -16, 22, -12, 5}, new long[] {-1, -2, 4, 21, 30, 11});
  }
}
