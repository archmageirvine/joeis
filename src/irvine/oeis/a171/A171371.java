package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171371 a(n) = 6*a(n-1) + 8*a(n-2) with a(1) = 8, a(2) = 18.
 * @author Sean A. Irvine
 */
public class A171371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171371() {
    super(new long[] {8, 6}, new long[] {8, 18});
  }
}
