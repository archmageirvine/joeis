package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178873.
 * @author Sean A. Irvine
 */
public class A178873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178873() {
    super(new long[] {-5, 11, -12, 7}, new long[] {0, 1, 5, 23});
  }
}
