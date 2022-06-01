package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092165 Let M = 2 X 2 matrix [ 1 2 / 5 4 ]; a(n) = (1,2) entry of M^n.
 * @author Sean A. Irvine
 */
public class A092165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092165() {
    super(new long[] {6, 5}, new long[] {2, 10});
  }
}
