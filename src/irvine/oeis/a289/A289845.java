package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289845 p-INVERT of A079977, where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289845() {
    super(new long[] {-1, 0, -2, -1, 1, -1, 3, 1}, new long[] {1, 2, 4, 9, 19, 43, 91, 202});
  }
}
