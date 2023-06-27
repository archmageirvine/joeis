package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196382 Number of sequences of n coin flips, that win on the last flip, if the sequence of flips ends with (1,1,0) or (1,0,1).
 * @author Sean A. Irvine
 */
public class A196382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196382() {
    super(1, new long[] {-1, 1, -1, 2}, new long[] {0, 0, 2, 3});
  }
}
