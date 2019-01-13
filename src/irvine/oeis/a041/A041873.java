package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041873.
 * @author Sean A. Irvine
 */
public class A041873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041873() {
    super(new long[] {1, 0, 0, 214, 0, 0}, new long[] {1, 2, 5, 212, 429, 1070});
  }
}
