package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158548 <code>a(n) = 169*n^2 + 13</code>.
 * @author Sean A. Irvine
 */
public class A158548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158548() {
    super(new long[] {1, -3, 3}, new long[] {13, 182, 689});
  }
}
