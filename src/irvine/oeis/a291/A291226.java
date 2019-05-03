package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291226 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where <code>p(S) = (1 - S)^6</code>.
 * @author Sean A. Irvine
 */
public class A291226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291226() {
    super(new long[] {-1, -6, -9, 10, 30, -6, -41, 6, 30, -10, -9, 6}, new long[] {6, 21, 62, 168, 426, 1029, 2394, 5403, 11892, 25626, 54228, 112958});
  }
}
