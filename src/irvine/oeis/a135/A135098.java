package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135098 Duplicate of A136488.
 * @author Sean A. Irvine
 */
public class A135098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135098() {
    super(new long[] {-4, 2, 2}, new long[] {1, 2, 5});
  }
}
