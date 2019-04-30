package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247061 Dynamic Betting Game <code>D(n,5,1)</code>.
 * @author Sean A. Irvine
 */
public class A247061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247061() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 8, 16, 17});
  }
}
