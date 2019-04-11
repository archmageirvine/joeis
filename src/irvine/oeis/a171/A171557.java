package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171557 <code>a(n) =</code> 3^n*A168053(n).
 * @author Sean A. Irvine
 */
public class A171557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171557() {
    super(new long[] {-81, 27, 0, 3}, new long[] {1, 3, -9, -81});
  }
}
