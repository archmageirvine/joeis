package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070511 Duplicate of A070431.
 * @author Sean A. Irvine
 */
public class A070511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070511() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 3, 4, 1});
  }
}
