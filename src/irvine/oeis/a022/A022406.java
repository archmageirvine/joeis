package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022406.
 * @author Sean A. Irvine
 */
public class A022406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022406() {
    super(new long[] {-1, 0, 2}, new long[] {3, 7, 11});
  }
}
