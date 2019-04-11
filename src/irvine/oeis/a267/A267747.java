package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267747 Numbers n such that <code>n (mod 2) = n (mod 3) = n (mod 5)</code>.
 * @author Sean A. Irvine
 */
public class A267747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267747() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 30});
  }
}
