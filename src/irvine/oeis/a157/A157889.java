package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157889 <code>a(n) = 18*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A157889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157889() {
    super(new long[] {1, -3, 3}, new long[] {19, 73, 163});
  }
}
