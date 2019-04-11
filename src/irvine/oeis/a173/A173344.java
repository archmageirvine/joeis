package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173344 <code>a(n+4) = a(n+3) - 2*a(n+2) - a(n+1) -</code> a(n).
 * @author Sean A. Irvine
 */
public class A173344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173344() {
    super(new long[] {-1, -1, -2, 1}, new long[] {0, 1, 0, -2});
  }
}
