package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292324 p-INVERT of (1,0,0,1,0,0,0,0,0,...), where p(S) = (1 - S)^2.
 * @author Sean A. Irvine
 */
public class A292324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292324() {
    super(new long[] {-1, 0, 0, -2, 2, 0, -1, 2}, new long[] {2, 3, 4, 7, 12, 19, 28, 42});
  }
}
