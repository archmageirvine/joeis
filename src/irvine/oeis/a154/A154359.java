package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154359 <code>a(n) = 1250*n^2 - 700*n + 99</code>.
 * @author Sean A. Irvine
 */
public class A154359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154359() {
    super(new long[] {1, -3, 3}, new long[] {99, 649, 3699});
  }
}
