package irvine.oeis.a001;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A001648 Tetranacci numbers A073817 without the leading term 4.
 * @author Sean A. Irvine
 */
public class A001648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001648() {
    super(new long[] {-1, 0, 0, 0, 2}, new long[] {1, 3, 7, 15, 26});
  }
}
