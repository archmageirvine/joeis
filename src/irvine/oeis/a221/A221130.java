package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221130 <code>a(n) = 2^(2*n - 1) + n</code>.
 * @author Sean A. Irvine
 */
public class A221130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221130() {
    super(new long[] {4, -9, 6}, new long[] {3, 10, 35});
  }
}
