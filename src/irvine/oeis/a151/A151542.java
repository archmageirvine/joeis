package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151542.
 * @author Sean A. Irvine
 */
public class A151542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151542() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 27});
  }
}
