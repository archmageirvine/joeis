package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203243.
 * @author Sean A. Irvine
 */
public class A203243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203243() {
    super(new long[] {27, -39, 13}, new long[] {3, 39, 390});
  }
}
