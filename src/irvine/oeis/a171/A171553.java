package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171553 a(n) = 9*10^n + 100^n + 1.
 * @author Sean A. Irvine
 */
public class A171553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171553() {
    super(new long[] {1000, -1110, 111}, new long[] {11, 191, 10901});
  }
}
