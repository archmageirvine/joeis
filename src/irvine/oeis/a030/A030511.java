package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030511 Graham-Sloane-type lower bound on the size of a ternary (n,3,3) constant-weight code.
 * @author Sean A. Irvine
 */
public class A030511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030511() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {2, 6, 10, 16, 24});
  }
}
