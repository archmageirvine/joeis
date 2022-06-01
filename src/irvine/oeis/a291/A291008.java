package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291008 p-INVERT of (1,1,1,1,1,...), where p(S) = 1 - 7*S^2.
 * @author Sean A. Irvine
 */
public class A291008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291008() {
    super(new long[] {6, 2}, new long[] {0, 7});
  }
}
