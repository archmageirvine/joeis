package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130482 <code>a(n) =</code> Sum_{k=0..n} (k <code>mod 4)</code> (Partial sums of A010873).
 * @author Sean A. Irvine
 */
public class A130482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130482() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 3, 6, 6});
  }
}
