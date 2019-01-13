package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195592.
 * @author Sean A. Irvine
 */
public class A195592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195592() {
    super(new long[] {4, -16, 25, -19, 7}, new long[] {32, 256, 1220, 4460, 13932});
  }
}
