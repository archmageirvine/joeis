package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190873.
 * @author Sean A. Irvine
 */
public class A190873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190873() {
    super(new long[] {-12, 12}, new long[] {0, 1});
  }
}
