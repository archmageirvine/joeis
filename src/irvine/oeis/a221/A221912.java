package irvine.oeis.a221;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A221912 Partial sums of floor(n/12).
 * @author Sean A. Irvine
 */
public class A221912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221912() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2});
  }
}
