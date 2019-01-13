package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179257.
 * @author Sean A. Irvine
 */
public class A179257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179257() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 1, 2, 5, 13, 32});
  }
}
