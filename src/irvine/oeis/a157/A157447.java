package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157447 <code>a(n) = 512*n - 16</code>.
 * @author Sean A. Irvine
 */
public class A157447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157447() {
    super(new long[] {-1, 2}, new long[] {496, 1008});
  }
}
