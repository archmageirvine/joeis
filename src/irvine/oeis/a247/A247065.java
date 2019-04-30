package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247065 Dynamic Betting Game <code>D(n,6,1)</code>.
 * @author Sean A. Irvine
 */
public class A247065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247065() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {1, 16, 24, 32, 40, 49, 64, 65});
  }
}
