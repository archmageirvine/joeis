package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157948 <code>a(n) = 64*n^2 -</code> n.
 * @author Sean A. Irvine
 */
public class A157948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157948() {
    super(new long[] {1, -3, 3}, new long[] {63, 254, 573});
  }
}
