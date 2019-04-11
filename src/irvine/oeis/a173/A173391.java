package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173391 <code>a(n) = 6n + 3^n</code>.
 * @author Sean A. Irvine
 */
public class A173391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173391() {
    super(new long[] {3, -7, 5}, new long[] {9, 21, 45});
  }
}
