package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255876 <code>a(n) = (4*n^2 + 4*n - 3 - 3*(-1)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A255876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255876() {
    super(new long[] {1, -2, 0, 2}, new long[] {4, 9, 24, 37});
  }
}
