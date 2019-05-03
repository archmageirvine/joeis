package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292536 p-INVERT of the squares <code>(A000290)</code>, where <code>p(S) = 1 + S - 3 S^2</code>.
 * @author Sean A. Irvine
 */
public class A292536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292536() {
    super(new long[] {-1, 5, -10, 26, -14, 7}, new long[] {1, 8, 48, 255, 1310, 6773});
  }
}
