package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292535 p-INVERT of the squares <code>(A000290)</code>, where <code>p(S) = 1 + S - 2 S^2</code>.
 * @author Sean A. Irvine
 */
public class A292535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292535() {
    super(new long[] {-1, 5, -11, 24, -15, 7}, new long[] {1, 7, 38, 189, 909, 4368});
  }
}
