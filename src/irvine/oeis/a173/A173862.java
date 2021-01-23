package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173862 a(n) = A158772(n-1)/21.
 * @author Sean A. Irvine
 */
public class A173862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173862() {
    super(new long[] {2, 0, 0}, new long[] {1, 1, 1});
  }
}
