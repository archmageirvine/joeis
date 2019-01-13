package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213400.
 * @author Sean A. Irvine
 */
public class A213400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213400() {
    super(new long[] {-1, 0, 2, 2, -1, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 2, 6, 19, 29, 52, 81, 116});
  }
}
