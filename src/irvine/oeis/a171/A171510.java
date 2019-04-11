package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171510 Generalized Lucas numbers: <code>a(n) = 10*a(n-1) + a(n-2),</code> with <code>a(1)=2</code> and <code>a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A171510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171510() {
    super(new long[] {1, 10}, new long[] {2, 1});
  }
}
