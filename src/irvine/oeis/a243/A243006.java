package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243006.
 * @author Sean A. Irvine
 */
public class A243006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243006() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 1, -1, 7, 27, 25});
  }
}
