package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137447.
 * @author Sean A. Irvine
 */
public class A137447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137447() {
    super(new long[] {4, 0, 0, 0}, new long[] {-1, -4, 2, 12});
  }
}
