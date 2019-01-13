package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095794.
 * @author Sean A. Irvine
 */
public class A095794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095794() {
    super(new long[] {1, -3, 3}, new long[] {1, 6, 14});
  }
}
