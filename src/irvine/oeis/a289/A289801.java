package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289801 p-INVERT of the tetrahedral numbers (A000292), where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289801() {
    super(new long[] {-1, 8, -28, 57, -74, 62, -31, 9}, new long[] {1, 6, 29, 133, 597, 2661, 11856, 52878});
  }
}
