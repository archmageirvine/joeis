package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188378 Partial sums of A005248.
 * @author Sean A. Irvine
 */
public class A188378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188378() {
    super(new long[] {1, -4, 4}, new long[] {2, 5, 12});
  }
}
