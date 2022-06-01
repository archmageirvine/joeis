package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190949 Odd Fibonacci numbers with odd index.
 * @author Sean A. Irvine
 */
public class A190949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190949() {
    super(new long[] {-1, 0, 18, 0}, new long[] {1, 5, 13, 89});
  }
}
