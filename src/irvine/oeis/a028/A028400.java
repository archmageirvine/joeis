package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028400 (2^n + 1)^2.
 * @author Sean A. Irvine
 */
public class A028400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028400() {
    super(new long[] {8, -14, 7}, new long[] {4, 9, 25});
  }
}
