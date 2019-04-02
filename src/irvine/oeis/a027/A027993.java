package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027993 a(n) = 1*T(n,2n) + 2*T(n,2n-1) + ... + (2n+1)*T(n,0), T given by A027926.
 * @author Sean A. Irvine
 */
public class A027993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027993() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 6, 20, 54});
  }
}
