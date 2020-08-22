package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171270 a(n) is the only number m such that m = pi(1^(1/n)) + pi(2^(1/n)) + ... + pi(m^(1/n)).
 * @author Sean A. Irvine
 */
public class A171270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171270() {
    super(new long[] {6, -11, 6}, new long[] {3, 11, 33});
  }
}
