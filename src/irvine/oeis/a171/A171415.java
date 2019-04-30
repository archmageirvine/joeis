package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171415 <code>a(n) = 99*a(n-1)-a(n-2); a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A171415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171415() {
    super(new long[] {-1, 99}, new long[] {0, 1});
  }
}
