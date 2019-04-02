package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173343 a(n+4) = a(n+3) - 2*a(n+2) - a(n+1) - a(n).
 * @author Sean A. Irvine
 */
public class A173343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173343() {
    super(new long[] {-1, -1, -2, 1}, new long[] {1, 2, 0, -5});
  }
}
