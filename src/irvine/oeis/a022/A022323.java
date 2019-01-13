package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022323.
 * @author Sean A. Irvine
 */
public class A022323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022323() {
    super(new long[] {-1, 0, 2}, new long[] {1, 9, 11});
  }
}
