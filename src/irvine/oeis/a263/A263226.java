package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263226 <code>a(n) = 15*n^2 - 13*n</code>.
 * @author Sean A. Irvine
 */
public class A263226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263226() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 34});
  }
}
