package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167710 <code>a(n) = 10*2^n - 3*A083658(n+2)</code>.
 * @author Sean A. Irvine
 */
public class A167710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167710() {
    super(new long[] {-6, 3, 2}, new long[] {1, 5, 13});
  }
}
