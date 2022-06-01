package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171522 Denominator of 1/n^2-1/(n+2)^2.
 * @author Sean A. Irvine
 */
public class A171522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171522() {
    super(new long[] {1, 0, -5, 0, 10, 0, -10, 0, 5, 0}, new long[] {0, 9, 16, 225, 144, 1225, 576, 3969, 1600, 9801});
  }
}
