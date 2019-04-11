package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186947 <code>a(n) = 4^n - n*2^n</code>.
 * @author Sean A. Irvine
 */
public class A186947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186947() {
    super(new long[] {16, -20, 8}, new long[] {1, 2, 8});
  }
}
