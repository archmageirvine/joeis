package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173434 <code>a(n) =</code> (A000045(n)-A173432(n))/2.
 * @author Sean A. Irvine
 */
public class A173434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173434() {
    super(new long[] {-1, 0, 2, -2, 0, 2}, new long[] {0, 0, 0, 1, 2, 4});
  }
}
