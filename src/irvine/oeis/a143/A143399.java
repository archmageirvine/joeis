package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143399 Expansion of x^k/Product_{t=k..2k} (1-tx) for k=4.
 * @author Sean A. Irvine
 */
public class A143399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143399() {
    super(new long[] {6720, -5944, 2070, -355, 30}, new long[] {0, 0, 0, 0, 1});
  }
}
