package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052976.
 * @author Sean A. Irvine
 */
public class A052976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052976() {
    super(new long[] {-2, 1, 0, 3}, new long[] {1, 1, 3, 10});
  }
}
