package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157814 <code>a(n) = 27225*n^2 - 2*n</code>.
 * @author Sean A. Irvine
 */
public class A157814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157814() {
    super(new long[] {1, -3, 3}, new long[] {27223, 108896, 245019});
  }
}
