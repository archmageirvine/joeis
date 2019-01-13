package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243717.
 * @author Sean A. Irvine
 */
public class A243717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243717() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {2, 7, 18, 43, 83, 156, 257, 418});
  }
}
