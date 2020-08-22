package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171510 Generalized Lucas numbers: a(n) = 10*a(n-1) + a(n-2), with a(1)=2 and a(2)=1.
 * @author Sean A. Irvine
 */
public class A171510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171510() {
    super(new long[] {1, 10}, new long[] {2, 1});
  }
}
