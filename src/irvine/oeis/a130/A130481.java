package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130481 <code>a(n) =</code> Sum_{k=0..n} (k <code>mod 3)</code> (i.e., partial sums of A010872).
 * @author Sean A. Irvine
 */
public class A130481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130481() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 3, 3});
  }
}
