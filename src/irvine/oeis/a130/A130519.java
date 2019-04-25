package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130519 <code>a(n) = Sum_{k=0..n} floor(k/4).</code> (Partial sums of A002265.).
 * @author Sean A. Irvine
 */
public class A130519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130519() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 0, 0, 0, 1, 2});
  }
}
