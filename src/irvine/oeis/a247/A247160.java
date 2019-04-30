package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247160 Dynamic Betting Game <code>D(n,4,3)</code>.
 * @author Sean A. Irvine
 */
public class A247160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247160() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17});
  }
}
