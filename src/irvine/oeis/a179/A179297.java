package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179297.
 * @author Sean A. Irvine
 */
public class A179297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179297() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 4, 2});
  }
}
