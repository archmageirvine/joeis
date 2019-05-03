package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289779 p-INVERT of the squares, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289779() {
    super(new long[] {-1, 5, -12, 22, -16, 7}, new long[] {1, 6, 28, 125, 546, 2371});
  }
}
