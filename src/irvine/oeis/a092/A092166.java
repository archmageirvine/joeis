package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092166 Let M = 2 X 2 matrix [ 1 2 / 5 4 ]; a(n) = (2,1) entry of M^n.
 * @author Sean A. Irvine
 */
public class A092166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092166() {
    super(1, new long[] {6, 5}, new long[] {5, 25});
  }
}
