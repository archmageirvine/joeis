package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291064.
 * @author Sean A. Irvine
 */
public class A291064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291064() {
    super(new long[] {-4, 12, -13, 6}, new long[] {4, 9, 26, 71});
  }
}
