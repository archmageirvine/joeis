package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085046 <code>a(n) = n^2 - (1 + (-1)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A085046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085046() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 3, 9, 15});
  }
}
