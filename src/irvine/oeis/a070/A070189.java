package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070189 12345679n.
 * @author Sean A. Irvine
 */
public class A070189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070189() {
    super(new long[] {-1, 2}, new long[] {0, 12345679});
  }
}
