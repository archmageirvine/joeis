package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261038.
 * @author Sean A. Irvine
 */
public class A261038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261038() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {1, 3, 0, 0, 0, 6, -1, -8, -1, 9, -2, -24});
  }
}
