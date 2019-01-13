package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190140.
 * @author Sean A. Irvine
 */
public class A190140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190140() {
    super(new long[] {3, 1, 2}, new long[] {1, 2, 5});
  }
}
