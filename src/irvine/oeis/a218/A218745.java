package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218745 a(n) = (42^n-1)/41.
 * @author Sean A. Irvine
 */
public class A218745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218745() {
    super(new long[] {-42, 43}, new long[] {0, 1});
  }
}
