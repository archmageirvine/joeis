package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095128 a(n+3) = 3*a(n+2) + 2*a(n+1) - a(n).
 * @author Sean A. Irvine
 */
public class A095128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095128() {
    super(new long[] {-1, 2, 3}, new long[] {1, 4, 13});
  }
}
