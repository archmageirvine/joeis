package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158067 <code>a(n) = 64*n^2 - 2*n</code>.
 * @author Sean A. Irvine
 */
public class A158067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158067() {
    super(new long[] {1, -3, 3}, new long[] {62, 252, 570});
  }
}
