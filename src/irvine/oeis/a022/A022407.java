package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022407.
 * @author Sean A. Irvine
 */
public class A022407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022407() {
    super(new long[] {-1, 0, 2}, new long[] {3, 8, 12});
  }
}
