package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291005 p-INVERT of (1,1,1,1,1,...), where p(S) = 1 - 2 S - 2 S^3.
 * @author Sean A. Irvine
 */
public class A291005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291005() {
    super(new long[] {5, -7, 5}, new long[] {2, 6, 20});
  }
}
