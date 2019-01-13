package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159582.
 * @author Sean A. Irvine
 */
public class A159582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159582() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 6, 7, 34});
  }
}
