package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130481 a(n) = Sum_{k=0..n} (k mod 3) (i.e., partial sums of A010872).
 * @author Sean A. Irvine
 */
public class A130481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130481() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 3, 3});
  }
}
