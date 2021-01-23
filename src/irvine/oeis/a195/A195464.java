package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195464 a(n) = 2^(4*n + 3) + 2*4^n + 3.
 * @author Sean A. Irvine
 */
public class A195464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195464() {
    super(new long[] {64, -84, 21}, new long[] {13, 139, 2083});
  }
}
