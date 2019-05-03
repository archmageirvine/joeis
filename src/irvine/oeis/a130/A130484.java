package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130484 <code>a(n) = Sum_{k=0..n} (k mod 6) (Partial</code> sums of <code>A010875)</code>.
 * @author Sean A. Irvine
 */
public class A130484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130484() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 6, 10, 15, 15});
  }
}
