package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169724.
 * @author Sean A. Irvine
 */
public class A169724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169724() {
    super(new long[] {27, -39, 13}, new long[] {9, 49, 361});
  }
}
