package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157910 <code>a(n) = 18*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A157910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157910() {
    super(new long[] {1, -3, 3}, new long[] {17, 71, 161});
  }
}
