package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136782.
 * @author Sean A. Irvine
 */
public class A136782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136782() {
    super(new long[] {27, 24, -43, 13}, new long[] {1, 2, 16, 119});
  }
}
