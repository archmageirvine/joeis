package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181975 The sequence {1, 2, 3, 4, 5, 4, 3, 2} repeated.
 * @author Sean A. Irvine
 */
public class A181975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181975() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {1, 2, 3, 4, 5});
  }
}
