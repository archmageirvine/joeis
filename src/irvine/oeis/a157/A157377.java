package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157377 <code>a(n) = 531441*n - 313146</code>.
 * @author Sean A. Irvine
 */
public class A157377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157377() {
    super(new long[] {-1, 2}, new long[] {218295, 749736});
  }
}
