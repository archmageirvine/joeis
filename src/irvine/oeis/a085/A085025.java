package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085025 a(n) = (5*n+1)*(5*n+6).
 * @author Sean A. Irvine
 */
public class A085025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085025() {
    super(new long[] {1, -3, 3}, new long[] {6, 66, 176});
  }
}
