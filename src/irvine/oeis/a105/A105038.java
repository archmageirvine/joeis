package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105038.
 * @author Sean A. Irvine
 */
public class A105038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105038() {
    super(new long[] {1, -11, 11}, new long[] {0, 4, 44});
  }
}
