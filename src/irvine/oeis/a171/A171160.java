package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171160 a(n) = a(n-1) + 2a(n-2) with a(0)=3, a(1)=4.
 * @author Sean A. Irvine
 */
public class A171160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171160() {
    super(new long[] {2, 1}, new long[] {3, 4});
  }
}
