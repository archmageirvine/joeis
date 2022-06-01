package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130483 a(n) = Sum_{k=0..n} (k mod 5) (Partial sums of A010874).
 * @author Sean A. Irvine
 */
public class A130483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130483() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 3, 6, 10, 10});
  }
}
