package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278129 <code>a(n) = 348*2^n - 188</code>.
 * @author Sean A. Irvine
 */
public class A278129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278129() {
    super(new long[] {-2, 3}, new long[] {160, 508});
  }
}
