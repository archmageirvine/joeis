package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292484 p-INVERT of the odd positive integers, where <code>p(S) = 1 + S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A292484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292484() {
    super(new long[] {-1, 7, -4, 3}, new long[] {-1, -1, 4, 9});
  }
}
