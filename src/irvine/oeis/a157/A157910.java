package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157910 a(n) = 18*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A157910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157910() {
    super(1, new long[] {1, -3, 3}, new long[] {17, 71, 161});
  }
}
