package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037694.
 * @author Sean A. Irvine
 */
public class A037694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037694() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {1, 12, 120, 1203, 12031});
  }
}
