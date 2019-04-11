package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251867 Numbers n such that <code>n^2 + (n+1)^2</code> is equal to the sum of the hexagonal numbers H(m) and H(m+1) for some m.
 * @author Sean A. Irvine
 */
public class A251867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251867() {
    super(new long[] {1, -35, 35}, new long[] {0, 14, 492});
  }
}
