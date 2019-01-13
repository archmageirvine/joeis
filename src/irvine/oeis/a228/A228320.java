package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228320.
 * @author Sean A. Irvine
 */
public class A228320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228320() {
    super(new long[] {1, -3, 3}, new long[] {203, 280, 369});
  }
}
