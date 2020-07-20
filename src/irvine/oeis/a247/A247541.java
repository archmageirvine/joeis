package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247541 <code>a(n) = 7*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A247541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247541() {
    super(new long[] {1, -3, 3}, new long[] {1, 8, 29});
  }
}
